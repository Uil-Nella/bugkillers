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

    public UserDO getUserDO(){
        UserDO user = new UserDO();
        user.setDr(DataValidEnum.VALID.getIndex());
        user.setBkCreate(new Date());
        user.setEmail("liuxy@meituan.com");
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
