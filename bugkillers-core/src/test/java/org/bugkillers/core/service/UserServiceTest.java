package org.bugkillers.core.service;

import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuxinyu on 15/6/9.
 */
public class UserServiceTest extends AbstractJunitTest{
    @Autowired
    private IUserService userService;

    /**
     * 正常注册
     */
    @Test
    public void registTest01(){
        try {
            BaseResult<User> result = userService.regist(getUserDO());
            Assert.assertNotNull(result);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void registTest02(){
        try {
            BaseResult<User> result = userService.regist(getUserDO());
            Assert.assertNotNull(result);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *用户名登录
     */
    @Test
    public void login01(){
        User userDO = new User();
        userDO.setUserName("AllenX");
        userDO.setPassword("pp");
        try {
            BaseResult<User> result = userService.login(userDO);
            Assert.assertNotNull(result);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *邮箱登录
     */
    @Test
    public void login02(){
        User userDO = new User();
        userDO.setEmail("liuxy1@meituan.com");
        userDO.setPassword("pp");
        try {
            BaseResult<User> result = userService.login(userDO);
            Assert.assertNotNull(result);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *错误登录
     */
    @Test
    public void login03(){
        User userDO = new User();
        userDO.setEmail("liuxy1@meituan.com");
        userDO.setPassword("ppp");
        try {
            userService.login(userDO);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public User getUserDO(){
        User user = new User();
        user.setEmail("liuxy1@meituan.com");
        user.setNickName("新宇");
        user.setUserName("AllenX");
        user.setPassword("pp");
        user.setHeadPic("11");
        return user;
    }
}
