/**
 * Created by dongbin on 2015/6/29.
 */
/**
 * 登录页面对象
 * @constructor
 */
BK.pages.LoginPage = function () {
    this.login = angular.module('login', []);
};

/**
 *  声明登录augular模型
 * @type {*|module}
 */
var login = new BK.pages.LoginPage().login;

/**
 * Service注册
 * 控制器
 */
login.factory('Url', function () {
    return BK.url.loginPage;
}).controller('loginCtrl', function ($scope, $http, Url) {
    $scope.msg = '';//错误提示
    //用户模型
    $scope.user = {
        userName: '',
        password: ''
    };
    //请求登录接口
    $scope.dologin = function () {
        //保证只传用户名或者邮箱
        var loginuserdata = $scope.user;
        if (loginuserdata.userName.contains('@')) {
            loginuserdata.email = loginuserdata.userName;
            delete loginuserdata.userName;
        } else {
            if (loginuserdata.email) {
                delete loginuserdata.email;
            }
        }
        alert(JSON.stringify(loginuserdata))
        $http.post(Url.remote.loginUrl, loginuserdata)
            .success(function (returndata) {
                $scope.ret = returndata.ret;
                $scope.code = returndata.code;
                $scope.msg = returndata.msg;
                if (returndata.ret) {
                    $scope.goBackToMainPage();
                }
            })
    };
    //跳转到之前的界面
    $scope.goBackToMainPage = function () {
        location.href = Url.local.backUrl;
    };

    //跳转到注册页
    $scope.goToRegisterPage = function () {
        location.href = Url.local.registerUrl;
    };
    //忘记密码
    $scope.forgetPassword = function () {
        alert('惩罚你再注册一个！嘿嘿...')
    }
});

