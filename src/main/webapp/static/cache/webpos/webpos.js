(function($) {
    $(function() {
        var priceJson = {}, nameJson = {};
        $.get("/cache/product", function(data) {
            for (var key in data) {
                var product = data[key];
                priceJson[product.id] = product.price;
                nameJson[product.id] = product.name;
                $("#productSelect").append("<option value='" + product.id + "'>" + product.name +"</option>");
            }
        });
        $.get("/cache/realUser", function(data) {
            for (var key in data) {
                var user = data[key];
                $("#userSelect").append("<option>" + user.name +"</option>");
            }
        });
        $("#addOrderButton").click(function() {
            var cache = [];
            if (localStorage.cacheOrder) {
                cache = JSON.parse(localStorage.cacheOrder);
            }
            var productId = $("#productSelect").val();
            var order = {
                id: new Date().getTime(),
                product: encodeURIComponent(nameJson[productId]),
                price: priceJson[productId],
                user: encodeURIComponent($("#userSelect").val())
            };
            cache.push(order);
            localStorage.cacheOrder = JSON.stringify(cache);
            if (navigator.onLine) {
                sync();
            } else {
                $("#msgShow").val("无法联网,数据缓存在本地\n" + localStorage.cacheOrder);
            }
        });
        $("#showCacheOrderButton").click(function() {
            $.post("/cache/showCacheOrder", function(data) {
                $("#msgShow").val(decodeURIComponent(data));
            });
        });
        $("#showLocalCache").click(function() {
            $("#msgShow").val(localStorage.cacheOrder);
        });
        window.online = function() {
            sync();
        };
        window.applicationCache.onupdateready = function() {
            // 有新版本,重新读取
            location.reload();
        }
        function sync() {
            if (!localStorage.cacheOrder) {
                return;
            }
            $.post("/cache/addOrder", {orderJson: localStorage.cacheOrder}, function(data) {
                localStorage.cacheOrder = "";
                $("#msgShow").val("result:" + JSON.stringify(data));
            });
        }
    });
} (jQuery));