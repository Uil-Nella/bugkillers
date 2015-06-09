package org.bugkillers.core.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.bugkillers.core.dao.UserDOMapper;
import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.domain.UserDOExample;
import org.bugkillers.core.enums.DataValidEnum;
import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.service.IUserService;
import org.bugkillers.core.util.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by liuxinyu on 15/6/9.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDOMapper userDOMapper;
    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public UserDO regist(UserDO user) throws UserException {
        //校验唯一性
        UserDOExample userDOExample = new UserDOExample();
        userDOExample.or().andUserNameEqualTo(user.getUserName());
        List<UserDO> userDOs =  userDOMapper.selectByExample(userDOExample);
        if (CollectionUtils.isNotEmpty(userDOs)){
            throw new UserException("用户名已经存在");
        }

        //处理部分参数
        user.setDr(DataValidEnum.VALID.getIndex());
        user.setBkCreate(new Date());
        user.setBkModified(new Date());
        user.setLoginTime(new Date());
        user.setRegistTime(new Date());
        //对密码进行md5
        user.setPassword(SecurityUtil.passAlgorithmsCiphering(user.getPassword(), SecurityUtil.MD5));

        int id = userDOMapper.insert(user);

        return userDOMapper.selectByPrimaryKey(id);
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @Override
    public boolean login(UserDO user) throws UserException {
        return false;
    }
}
