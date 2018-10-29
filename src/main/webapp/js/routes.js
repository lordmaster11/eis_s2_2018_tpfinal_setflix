angular
    .module('SetFlixApp.routes', ["ui.router"])
    .config(['$stateProvider', '$urlRouterProvider', '$locationProvider', function($stateProvider, $urlRouterProvider, $locationProvider) {

        $stateProvider
            .state({
                name: ' ',
                url: '/',
                redirectTo: 'login'
            })
            .state({
                name: 'login',
                url: '/login',
                controller: 'loginController',
                templateUrl: 'partials/login.html',
            })
            .state({
                name: 'registrarse',
                url: '/registrarse',
                controller: 'loginController',
                templateUrl: 'partials/registroForm.html',
            })
            .state({
                name: 'home',
                url: '/home',
                controller: 'homeController',
                templateUrl: 'partials/home.html',
            })
            .state({
                name: 'userProfile',
                url: '/userProfile',
                controller: 'homeController',
                templateUrl: 'partials/home.html',
            })

        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false
        });

        $urlRouterProvider.otherwise('/');
    }]);