/**
 * Created by dongbin on 2015/6/29.
 */

BK.pages.LoginPage = function () {
    this.login = angular.module('login', []);
};

/**
 *  声明登录augular模型
 * @type {*|module}
 */
var login = new BK.pages.LoginPage().login;

login.factory('Url', function () {
    return BK.url.loginPage;
});

