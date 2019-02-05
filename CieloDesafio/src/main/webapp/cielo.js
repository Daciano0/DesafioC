angular.module('desafiocielo', [])
.controller('cielo', function($scope, $http) {
    $http.get('http://localhost:8080/Cielo').
        then(function(response) {
            $scope.cielo = response.data;
        });
});