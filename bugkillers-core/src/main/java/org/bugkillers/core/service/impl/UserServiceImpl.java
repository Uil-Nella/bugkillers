package org.bugkillers.core.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bugkillers.core.constants.RetCode;
import org.bugkillers.core.dao.UserDOMapper;
import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.domain.UserDOExample;
import org.bugkillers.core.enums.DataValidEnum;
import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.IUserService;
import org.bugkillers.core.util.BeanMapper;
import org.bugkillers.core.util.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.bugkillers.core.constants.LogConstants.SERVICE_LOGGER;

import java.util.Date;
import java.util.List;

/**
 * Created by liuxinyu on 15/6/9.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private BeanMapper beanMapper;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public BaseResult<User> regist(User user) throws UserException {
        BaseResult<User> result = new BaseResult<User>();
        //校验唯一性 (用户名和邮箱)
        UserDOExample userDOExample = new UserDOExample();
        userDOExample.or().andUserNameEqualTo(user.getUserName());
        List<UserDO> userDOs = userDOMapper.selectByExample(userDOExample);
        if (CollectionUtils.isNotEmpty(userDOs)) {
            return result.setMsg("用户名已经存在!").setCode(RetCode.REGIST_NAME_EXIST);
        }
        userDOExample = new UserDOExample();
        userDOExample.or().andEmailEqualTo(user.getEmail());
        userDOs = userDOMapper.selectByExample(userDOExample);
        if (CollectionUtils.isNotEmpty(userDOs)) {
            return result.setMsg("邮箱已经存在!").setCode(RetCode.REGIST_EMAIL_EXIST);
        }

        UserDO dbUser = new UserDO();
        beanMapper.copy(user, dbUser);
        //处理部分参数
        dbUser.setDr(DataValidEnum.VALID.getIndex());
        dbUser.setBkCreate(new Date());
        dbUser.setBkModified(new Date());
        dbUser.setLoginTime(new Date());
        dbUser.setRegistTime(new Date());
        //对密码进行md5
        dbUser.setPassword(SecurityUtil.passAlgorithmsCiphering(dbUser.getPassword(), SecurityUtil.MD5));

        try {
            int id = userDOMapper.insert(dbUser);
            //dbUser = userDOMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            SERVICE_LOGGER.error("DAO出现异常", e);
            return result.setMsg("注册失败");
        }
        //注册成功
        beanMapper.copy(dbUser, user);
        return result.setT(user).setRet(true).setMsg("注册成功");
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @Override
    public BaseResult<User> login(User user) throws UserException {
        BaseResult<User> result = new BaseResult<>();
        UserDO dbUser = new UserDO();
        //密码处理
        user.setPassword(SecurityUtil.passAlgorithmsCiphering(user.getPassword(), SecurityUtil.MD5));
        UserDOExample userDOExample = new UserDOExample();
        if (StringUtils.isNotEmpty(user.getUserName())) {
            //使用用户名登录
            userDOExample.or().andUserNameEqualTo(user.getUserName());
            List<UserDO> userDOs = userDOMapper.selectByExample(userDOExample);
            if (CollectionUtils.isEmpty(userDOs)){
                return result.setMsg("用户名不存在！").setCode(RetCode.LOGIN_NAME_NOT_EXIST);
            }
            userDOExample = new UserDOExample();
            userDOExample.or().andUserNameEqualTo(user.getUserName()).andPasswordEqualTo(user.getPassword());
            userDOs = userDOMapper.selectByExample(userDOExample);
            if (CollectionUtils.isNotEmpty(userDOs)) {
                dbUser = userDOs.get(0);
            }

        }
        if (StringUtils.isNotEmpty(user.getEmail())) {
            //使用邮箱登录
            userDOExample = new UserDOExample();
            userDOExample.or().andEmailEqualTo(user.getEmail());
            List<UserDO> userDOs = userDOMapper.selectByExample(userDOExample);
            if (CollectionUtils.isEmpty(userDOs)){
                return result.setMsg("邮箱不存在！").setCode(RetCode.LOGIN_EMAIL_NOT_EXIST);
            }
            userDOExample.or().andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());
            userDOs = userDOMapper.selectByExample(userDOExample);
            if (CollectionUtils.isNotEmpty(userDOs)) {
                dbUser = userDOs.get(0);
            }
        }
        if (null == dbUser || null == dbUser.getId()) {
            return result.setMsg("密码不正确！").setCode(RetCode.LOGIN_PASS_ERROR);
        }
        beanMapper.copy(dbUser, user);
        return result.setT(user).setRet(true).setMsg("登录成功");
    }

    /**
     * 根据id查找用户
     *
     * @param userId
     * @return
     * @throws UserException
     */
    @Override
    public BaseResult<User> findById(Integer userId) throws UserException {
        BaseResult<User> result = new BaseResult<>();
        UserDO dbUser = new UserDO();
        dbUser = userDOMapper.selectByPrimaryKey(userId);
        if (0 == dbUser.getId()) {
            return result.setMsg("没有符合条件的用户！");
        }
        User user = new User();
        beanMapper.copy(dbUser, user);
        return result.setT(user).setRet(true);
    }
}
