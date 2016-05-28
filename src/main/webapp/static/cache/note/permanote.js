(function($) {
    var editor, statusline, saveButton, syncButton, updateButton, idleTimer, localStorage =  window.localStorage;
    window.onload = function() {
        // 第一次初始化时,初始化本地存储
        if (localStorage.note == null) {
            localStorage.note = "";
        }
        if (localStorage.lastModified == null) {
            localStorage.lastModified = 0;
        }
        if (localStorage.lastSaved == null) {
            localStorage.lastSaved = 0;
        }
        editor = $("#editor");
        statusline = $("#statusline");
        saveButton = $("#saveButton");
        syncButton = $("#syncButton");
        updateButton = $("#updateButton");
        editor.val(localStorage.note);
        editor.attr("disabled", true); // 同步前禁止编辑
        // 一旦文本区域有内容输入
        editor.bind("input", function(e) {
           // 将新的值保存到localStorage中
            localStorage.note = editor.val();
            localStorage.lastModified = Date.now();
            // 重置闲置计时器
            if (idleTimer) window.clearTimeout(idleTimer);
            idleTimer = setTimeout(save, 5000);
            // 启用保存按钮
            saveButton.removeAttr("disabled");
        });
        saveButton.bind("click", save);
        syncButton.bind("click", sync);
        updateButton.bind("click", function() {
            applicationCache.update();
        });
        // 每次载入应用程序时,尝试同步服务器
        sync();
    }
    // 离开页面前保存数据到服务器
    window.onbeforeunload = function() {
        if (localStorage.lastModified > localStorage.lastSaved) {
            save();
        }
    }
    // 离线时,通知用户
    window.onoffline = function() {
        msgStatus("离线");
    }
    // 再次返回在线状态时,进行同步
    window.online = function() {
        sync();
    }
    // 当有新版本的时候通知用户
    // 也可以强制重新载入,location.reload();
    window.applicationCache.onupdateready = function() {
        msgStatus("正在更新新版本...");
        location.reload();
    }
    // 没有新版本的 时候也通知用户
    window.applicationCache.onnoupdate = function() {
        msgStatus("没有可更新的版本");
    }

    // 每当笔记内容更新后,如果用户停止编辑超过五分钟,
    // 就会自动将笔记文本上传到服务器(在线状态下)
    function save() {
        if (idleTimer) {
            clearTimeout(idleTimer);
        }
        idleTimer = null;
        if (navigator.onLine) {
            $.post("/cache/note", {note: editor.val()}, function() {
                localStorage.lastSaved = Date.now();
                saveButton.attr("disabled", true);
            });
        }
    }
    // 检查服务器是否有新版本的笔记
    // 如果没有,则将当前版本保存到服务器端
    function sync() {
        if (navigator.onLine) {
            $.get("/cache/note", function(data) {
                var remoteModTime = 0;
                remoteModTime = data["last"];
                remoteModTime = new Date(remoteModTime).getTime();
                if (remoteModTime > localStorage.lastSaved) {
                    msgStatus("发现需要更新的内容");
                    var useit = confirm("是否使用新版本内容替换当前数据")
                    var now = Date.now();
                    if (useit) {
                        localStorage.note = data.data;
                        editor.val(data.data);
                        localStorage.lastSaved = now;
                        msgStatus("已经下载了最新数据");
                    }
                } else {
                    msgStatus("没有发现新数据");
                }
                if (localStorage.lastModified > localStorage.lastSaved) {
                    save();
                }
                editor.removeAttr("disabled");    // 再次启用编辑器
                editor.focus();
            });
        } else { // 离线状态,不能同步
            msgStatus("离线状态,同步失败");
            editor.removeAttr("disabled");    // 再次启用编辑器
            editor.focus();
        }
    }
    function msgStatus(status) {
        statusline.text(status);
    }
} (jQuery));