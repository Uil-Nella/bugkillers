package org.bugkillers.core.controller;

import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.exception.UserException;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.IUserService;
import org.bugkillers.core.util.BeanMapper;
import org.bugkillers.core.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuxinyu on 15/6/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private BeanMapper beanMapper;
    /**
     * 注册用户
     * @param user
     */
    @ResponseBody
    @RequestMapping(value = { "/regist" }, method = RequestMethod.POST)
    public ResponseEntity<?> regist(@RequestBody User user) {
        BaseResult<String> result = null;
        UserDO userDO = new UserDO();
        beanMapper.copy(user,userDO);
        try {
            userService.regist(userDO);
        } catch (UserException e) {
            result = ResultUtil.buildErrorResult("注册失败","注册失败","注册失败");
            return new ResponseEntity<BaseResult<String>>(result, HttpStatus.OK);
        }
        result = ResultUtil.buildSuccessResult("注册成功");
        return new ResponseEntity<BaseResult<String>>(result, HttpStatus.OK);
    }
}
