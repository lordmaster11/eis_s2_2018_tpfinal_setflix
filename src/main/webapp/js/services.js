'use strict';

angular.module('SetFlixApp.services', ['ngResource'])
    .factory('seriesService', function($resource) {
        return $resource(
            'https://webpymes-api.herokuapp.com/pymes/:id',
            {},
            {'query': {method: 'GET',isArray: true,headers: {'Content-Type':'application/json'}}},
            {stripTrailingSlashes: false}
        );
    });