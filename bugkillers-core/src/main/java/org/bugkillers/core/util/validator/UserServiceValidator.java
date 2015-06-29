package org.bugkillers.core.util.validator;

import org.apache.commons.lang.StringUtils;
import org.bugkillers.core.constants.RetCode;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.util.RegexUtil;

/**
 * Created by liuxinyu on 15/6/29.
 */
public class UserServiceValidator {
    /**
     * email 正则校验
     */
    public static final String RE_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 登录校验
     *
     * @return
     */
    public static BaseResult<User> loginValidator(User user) {
        BaseResult<User> result = new BaseResult<>();
        if (null == user||StringUtils.isEmpty(user.getEmail())||(StringUtils.isEmpty(user.getUserName())
                &StringUtils.isEmpty(user.getPassword()))){
            return result.setMsg("必要请求参数不可为空").setCode(RetCode.PARAM_EMPTY);
        }
        return result.setRet(true);
    }

    /**
     * 注册校验
     *
     * @return
     */
    public static BaseResult<User> registValidator(User user) {
        BaseResult<User> result = new BaseResult<>();
        if (null == user || StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getNickName())
                || StringUtils.isEmpty(user.getPassword())) {
            return result.setMsg("必要请求参数不可为空").setCode(RetCode.PARAM_EMPTY);
        }
        if (RegexUtil.check(RegexUtil.RE_EMAIL, user.getEmail())){
            return result.setMsg("邮箱格式不正确").setCode(RetCode.REGIST_EMAIL_FORMAT_ERROR);
        }
        return result.setRet(true);
    }


}
