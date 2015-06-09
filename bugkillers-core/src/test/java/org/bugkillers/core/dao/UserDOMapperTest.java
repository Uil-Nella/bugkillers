package org.bugkillers.core.dao;

import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/9.
 */
public class UserDOMapperTest extends AbstractJunitTest {
    @Autowired
    private UserDOMapper userDOMapper;

    @Test
    public void insertTest(){
        UserDO user = new UserDO();
        user.setDr((byte)1);
        user.setBkCreate(new Date());
        user.setEmail("liuxy@meituan.com");
        user.setBkModified(new Date());
        user.setNickName("新宇");
        user.setUserName("Allen");
        user.setPassword("pp");
        user.setHeadPic("11");
        user.setLoginTime(new Date());
        user.setRegistTime(new Date());
        userDOMapper.insert(user);
    }
}
