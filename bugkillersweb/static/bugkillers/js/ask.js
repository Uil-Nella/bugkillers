/**
 * Created by dongbin on 2015/7/9.
 */
/**
 * 创建提问页面对象
 * @constructor
 */
BK.pages.AskPage = function () {
    this.askpage = angular.module('ask', []);
};
/**
 * 创建实例
 * @type {*|module}
 */
var ask = new BK.pages.AskPage().askpage;


ask.factory('Url', function () {
    return BK.url.askPage;
}).controller('askCtrl', function ($scope, $http) {

});

