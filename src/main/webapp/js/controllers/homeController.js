var app = angular.module('SetFlixApp');

angular.module('SetFlixApp').controller('homeController', function($scope,$stateParams,$state,$rootScope) {
    $scope.usuario = JSON.parse(localStorage.getItem('usuarioLogueado'));

    $rootScope.state = $state.current.name;

    if ($scope.usuario) {
        $rootScope.usuarioNombre = $scope.usuario.nombre;
    } else {
        $rootScope.usuarioNombre = "";
    }

    $rootScope.logout = function () {
        localStorage.clear();
        $state.go('home');
    };

    $rootScope.editarUsuario = function(){
        $state.go('editarUsuario', {idUsuario: $scope.usuario.id});
    }
});