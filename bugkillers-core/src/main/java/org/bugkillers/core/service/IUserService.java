package org.bugkillers.core.service;

import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.exception.UserException;

/**
 * Created by liuxinyu on 15/6/9.
 */
public interface IUserService {
    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    UserDO regist(UserDO user) throws UserException;

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    boolean login(UserDO user) throws UserException;

}
