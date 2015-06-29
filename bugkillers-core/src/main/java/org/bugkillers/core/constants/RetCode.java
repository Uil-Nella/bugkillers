package org.bugkillers.core.constants;

/**
 * Created by liuxinyu on 15/6/29.
 */
public interface RetCode {

    /**
     * 成功
     */
    int SUCCESS = 0 ;
    /**
     * 请求参数为空
     */
    int PARAM_EMPTY = 1000;

    /**
     * 邮箱已经存在
     */
    int REGIST_EMAIL_EXIST = 1001;

    /**
     * 用户名已经存在
     */
    int REGIST_NAME_EXIST = 1002;

    /**
     * 邮箱格式不正确
     */
    int REGIST_EMAIL_FORMAT_ERROR = 1006;

    /**
     * 用户名不存在
     */
    int LOGIN_NAME_NOT_EXIST = 1003;

    /**
     * 邮箱不存在
     */
    int LOGIN_EMAIL_NOT_EXIST = 1004;

    /**
     * 密码错误
     */
    int LOGIN_PASS_ERROR = 1005;
}
