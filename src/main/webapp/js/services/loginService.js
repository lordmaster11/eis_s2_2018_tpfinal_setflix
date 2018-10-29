var app = angular.module('SetFlixApp');

'use strict';
app.factory('loginService', function($resource){
    return $resource('/login/:nombre/:password', {'usuario': '@usuario', 'password': '@password'}, {
        'query': {method: 'GET'},
    });
});