var app = angular.module('SetFlixApp');

'use strict';
app.factory('registrarService', function($resource){
    return $resource('/usuarios/', {
        'save': {method: 'POST'},
    });
});