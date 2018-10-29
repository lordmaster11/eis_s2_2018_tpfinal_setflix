var app = angular.module('SetFlixApp');

'use strict';
app.factory('usuariosService', function($resource) {
    return $resource('/usuarios/:id', {'id': '@id'}, {
        'update': {method: 'PUT'},
    });
});