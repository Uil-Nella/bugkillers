/**
 * Created by dongbin on 2015/6/27.
 */

/**
 * 首页对象
 * @constructor
 */
BK.pages.IndexPage = function () {
    this.index = angular.module('index', []);
};

var indexPageInstance = new BK.pages.IndexPage();

var index = indexPageInstance.index;

/**
 * 服务和控制器
 */
index.factory('Url', function () {
    return BK.url.indexPage;
}).controller('indexCtrl', function ($scope, $http, Url) {

});