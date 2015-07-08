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
    //用户模型
    $scope.user = {
        userName: '',
        password: ''
    };
    $scope.code = '';//ret为false时有效
    $scope.msg = '';//信息
    $scope.ret = true;//是否成功

    //请求登录接口
    $scope.dologin = function () {
        //保证只传用户名或者邮箱
        var loginuserdata = $scope.user;
        if (loginuserdata.userName.indexOf('@') != -1) {
            loginuserdata.email = loginuserdata.userName;
            delete loginuserdata.userName;
        } else {
            if (loginuserdata.email) {
                delete loginuserdata.email;
            }
        }
        $http.post(Url.remote.loginUrl, loginuserdata)
            .success(function (returndata) {
                $scope.setReturnData(returndata);
                if (returndata.ret) {
                    $scope.goBackToMainPage();
                }
            }).error(function (returndata) {
                $scope.setReturnData(returndata);
            });

        //$http({
        //    method: 'POST',
        //    url: Url.remote.loginUrl,
        //    data: loginuserdata,
        //    dataType: 'json',
        //    async: false,
        //    cache: false,
        //    success: function (returndata) {
        //        alert('success');
        //        $scope.setReturnData(returndata);
        //        if (returndata.ret) {
        //            $scope.goBackToMainPage();
        //        }
        //    },
        //    error: function (returndata) {
        //        alert('error');
        //        $scope.setReturnData(returndata);
        //
        //    }
        //});
    };
    //设置返回提示信息
    $scope.setReturnData = function (returndata) {
        $scope.ret = returndata.ret;
        $scope.code = returndata.code;
        $scope.msg = returndata.msg;
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
        alert('惩罚你再注册一个！嘿嘿...');
    };
});

