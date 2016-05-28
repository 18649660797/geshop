(function(w) {
    var ajaxHelper = {
        handleAjax: function(data) {
            if (data && data.result) {
                return true;
            } else if (data.error || data.message) {
                $(document).tooltip(data.error || data.message)
            }
            return false;
        }
    };
    w.ajaxHelp = ajaxHelper;
} (window));