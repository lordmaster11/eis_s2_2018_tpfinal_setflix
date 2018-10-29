var app = angular.module('SetFlixApp');

angular.module('SetFlixApp').controller('indexController', function($scope,$state) {

    $scope.noEstaLogueado = function(){
        usuario = JSON.parse(localStorage.getItem('usuarioLogueado'));
        return (usuario === null);
    }

    $scope.estaEnUserHome = function(){
        estado = $state.current.name;
        return (estado == 'userProfile');
    }

});