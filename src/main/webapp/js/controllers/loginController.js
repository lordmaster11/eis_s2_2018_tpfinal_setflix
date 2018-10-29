var app = angular.module('SetFlixApp');

angular.module('SetFlixApp').controller('loginController', function($scope,$state,loginService,registrarService,$rootScope) {
    $scope.credentials = {nombre:'', password:''};
    $scope.newUsuario = {usuario: '',password: '',confPassword: '',email: ''};
    vm = this;
    $rootScope.state = $state.current.name;
    $scope.login = function(){
        vm.errorLogin("");
        var credentials = $scope.credentials;
        if(vm.validarDatos(credentials)){

            loginService.query(credentials, function(user) {
                localStorage.setItem('usuarioLogueado', JSON.stringify(user));
                console.log(user)

                $state.go('userProfile');
            }, function(error){
                vm.errorLogin("Usuario o contraseña invalida");
            });

        } else {
            vm.errorLogin("Complete todos los campos");
        }
    }

    $scope.registrar = function(){
        vm.errorRegister("")
        if(vm.validarDatos($scope.newUsuario)){
            registrarService.save($scope.newUsuario, function(usuario){
                localStorage.setItem('usuarioLogueado', JSON.stringify(usuario));
                $state.go('home');
            }, function(){
                console.log("Hubo un problema al registrar")
            });

        } else {
            vm.errorRegister("Complete todos los campos");
        }
    }

    vm.errorLogin = function(string){
        $('#errorSpan').html(string);
    }

    vm.errorRegister = function(string){
        $('#errorSpanReg').html(string);
    }

    vm.validarDatos = function(datos){
        let invalido = false;
        angular.forEach(datos, function(dato) {
            if(!invalido){
                if(!dato){
                    invalido = true;
                }
            }
        });
        return !invalido;
    }
});
