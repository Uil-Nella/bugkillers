package org.bugkillers.core.service;

import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;

/**
 * Created by liuxinyu on 15/6/9.
 */
public interface IUserService {
    /**
     * 用户注册
     * @param user
     * @return
     * @throws UserException
     */
    BaseResult<User> regist(User user) throws UserException;

    /**
     * 用户登录
     * @param user
     * @return
     * @throws UserException
     */
    BaseResult<User> login(User user) throws UserException;

    /**
     * 根据id查找用户
     * @param userId
     * @return
     * @throws UserException
     */
    BaseResult<User> findById(Integer userId) throws UserException;

}
