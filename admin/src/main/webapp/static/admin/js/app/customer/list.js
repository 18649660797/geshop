app.controller('MailCtrl', ['$scope', function($scope) {
    $scope.folds = [
        {name: '普通会员', filter:'normal'},
        {name: '分销商', filter:'distributors'}
    ];

    $scope.labels = [
        {name: 'Angular', filter:'angular', color:'#23b7e5'},
        {name: 'Bootstrap', filter:'bootstrap', color:'#7266ba'},
        {name: 'Client', filter:'client', color:'#fad733'},
        {name: 'Work', filter:'work', color:'#27c24c'}
    ];

    $scope.addLabel = function(){
        $scope.labels.push(
            {
                name: $scope.newLabel.name,
                filter: angular.lowercase($scope.newLabel.name),
                color: '#ccc'
            }
        );
        $scope.newLabel.name = '';
    }

    $scope.labelClass = function(label) {
        return {
            'b-l-info': angular.lowercase(label) === 'angular',
            'b-l-primary': angular.lowercase(label) === 'bootstrap',
            'b-l-warning': angular.lowercase(label) === 'client',
            'b-l-success': angular.lowercase(label) === 'work'
        };
    };

}]);

app.controller('MailListCtrl', ['$scope', 'mails', '$stateParams', '$http', function($scope, mails, $stateParams, $http) {
    $scope.type = $stateParams.type;
    $http.get("/customer/data").success(function(response) {
        $scope.customers = response.rows;
    });
    console.log("###########");
    mails.all().then(function(mails){
        $scope.mails = mails;
    });
}]);

app.controller('MailDetailCtrl', ['$scope', 'mails', '$stateParams', function($scope, mails, $stateParams) {
    mails.get($stateParams.mailId).then(function(mail){
        $scope.mail = mail;
    })
}]);

app.controller('MailNewCtrl', ['$scope', function($scope) {
    $scope.mail = {
        to: '',
        subject: '',
        content: ''
    }
    $scope.tolist = [
        {name: 'James', email:'james@gmail.com'},
        {name: 'Luoris Kiso', email:'luoris.kiso@hotmail.com'},
        {name: 'Lucy Yokes', email:'lucy.yokes@gmail.com'}
    ];
}]);

angular.module('app').directive('labelColor', function(){
    return function(scope, $el, attrs){
        $el.css({'color': attrs.color});
    }
});