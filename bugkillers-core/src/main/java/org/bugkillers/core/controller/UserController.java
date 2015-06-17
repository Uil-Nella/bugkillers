package org.bugkillers.core.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import org.bugkillers.core.constants.LogConstants;
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
import org.springframework.web.bind.annotation.*;

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
     *
     * @param user
     */
    @ResponseBody
    @RequestMapping(value = {"/regist"}, method = RequestMethod.POST)
    public ResponseEntity<?> regist(@RequestBody User user) {
        BaseResult<String> result = null;
        UserDO userDO = new UserDO();
        beanMapper.copy(user, userDO);
        try {
            userService.regist(userDO);
        } catch (UserException e) {
            result = ResultUtil.buildErrorResult("注册失败", "注册失败", "注册失败");
            LogConstants.SERVICE_LOGGER.error("注册失败", e);
            return new ResponseEntity<BaseResult<String>>(result, HttpStatus.OK);
        }
        result = ResultUtil.buildSuccessResult("注册成功");
        return new ResponseEntity<BaseResult<String>>(result, HttpStatus.OK);
    }

    /**
     * 根据pk查找用户
     *
     * @param userId
     * @return
     */
    @ApiOperation(value = "根据id查找用户", notes = "返回用户实体对象", response = User.class, position = 2)
    @ResponseBody
    @RequestMapping(value = {"/{userId}"}, method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable("userId") Integer userId) {
        UserDO userDO = new UserDO();
        try {
            userDO = userService.findById(userId);
        } catch (UserException e) {
            LogConstants.SERVICE_LOGGER.error("查找失败", e);
        }
        User user = new User();
        beanMapper.copy(userDO, user);
        BaseResult<User> result = ResultUtil.buildSuccessResult(user);
        return new ResponseEntity<BaseResult<User>>(result, HttpStatus.OK);
    }
}