package org.bugkillers.core.service;

import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.enums.DataValidEnum;
import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

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
            UserDO userDO = userService.regist(getUserDO());
            Assert.assertNotNull(userDO);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void registTest02(){
        try {
            UserDO userDO = userService.regist(getUserDO());
            Assert.assertNotNull(userDO);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *用户名登录
     */
    @Test
    public void login01(){
        UserDO userDO = new UserDO();
        userDO.setUserName("AllenX");
        userDO.setPassword("pp");
        try {
            boolean b = userService.login(userDO);
            Assert.assertNotNull(b);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *邮箱登录
     */
    @Test
    public void login02(){
        UserDO userDO = new UserDO();
        userDO.setEmail("liuxy1@meituan.com");
        userDO.setPassword("pp");
        try {
            boolean b = userService.login(userDO);
            Assert.assertNotNull(b);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    /**
     *错误登录
     */
    @Test
    public void login03(){
        UserDO userDO = new UserDO();
        userDO.setEmail("liuxy1@meituan.com");
        userDO.setPassword("ppp");
        try {
            boolean b = userService.login(userDO);
            Assert.assertNotNull(b);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public UserDO getUserDO(){
        UserDO user = new UserDO();
        user.setDr(DataValidEnum.VALID.getIndex());
        user.setBkCreate(new Date());
        user.setEmail("liuxy1@meituan.com");
        user.setBkModified(new Date());
        user.setNickName("新宇");
        user.setUserName("AllenX");
        user.setPassword("pp");
        user.setHeadPic("11");
        user.setLoginTime(new Date());
        user.setRegistTime(new Date());
        return user;
    }
}
