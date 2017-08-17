;
(function($) {

	var loginApp = angular.module("loginApp", [])
//		.config(["$httpProvider", function ($httpProvider) {
//	        $httpProvider.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded;charset=utf-8";
//	        $httpProvider.defaults.transformRequest = function (data) { 
//	            //把JSON数据转换成字符串形式
//	            if (data !== undefined) { 
//	                return $.param(data);
//	            }
//	            return data;
//	        };
//    }]);

	loginApp.controller("loginController", function($scope, $http) {

		$scope.user = {};

		$scope.login = function() {
			var account = $scope.user.account;
			var password = md5($scope.user.password);
			// $http.post("/sky/login", $scope.user).success(function(data) {
			// console.info(data);
			// });
			$http({
				method : 'POST',
				url : '/sky/login',
				headers : {
					'Content-Type' : 'application/x-www-form-urlencoded;charset=utf-8'
				},
				data : {
					account : account,
					password : password
				},
				transformRequest: function(data, headersGetter) {
					return $.param(data);
				}
			}).then(function successCallback(response) {
				// this callback will be called asynchronously
				// when the response is available
				console.info(response);
			}, function errorCallback(response) {
				// called asynchronously if an error occurs
				// or server returns response with an error status.
			});
		}
		
	});

})(jQuery);