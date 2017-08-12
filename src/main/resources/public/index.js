var app = angular.module('myApp', []);
app.controller('userdetails', function($scope,$http) {
	$scope.user = {};
	$scope.templeteUrl = "/register.html";
	/*$http.get("/getuserfitnessdetails").then(function (response) {
	      $scope.details = response.data;
	 }); */  
	
	$scope.submitUserDetails = function(){
		$scope.user.coach = $('#coach').val();
		$scope.user.gender = $('#gender-male').val()
		var config = {
                headers : {
                    'Content-Type': 'application/json'
                }
            }
         $http.post('/saveuserdetails', $scope.user, config)
         .then(function(data){$scope.templeteUrl = "/userdetails.html";
         $scope.details = data.data.details;
         $scope.coatchdetails = data.data.coatchdetails;
	    });
	}
});