package org.bugkillers.back.user.controller;

import java.util.List;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.result.Result;
import org.bugkillers.back.user.service.UserService;
import org.bugkillers.back.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * 用户操作Controller
 * <p/>
 * <p>
 * 
 * @author 刘新宇
 *
 *         <p>
 * @date 2015年1月30日 上午10:50:34
 *       <p>
 * @version 0.0.1
 */
@Api(value = "user-api", description = "有关于用户的CURD操作", position = 5)
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	/**
	 * 注册用户
	 * @param user
	 */
	@ApiOperation(value = "注册", notes = "注册用户", position = 3)
	@ResponseBody
	@RequestMapping(value = { "/regist" }, method = RequestMethod.POST)
	public void regist(@RequestBody User user) {
		service.save(user);
	}
	
	/**
	 * 根据pk查找用户
	 * @param userPk
	 * @return
	 */
	@ApiOperation(value = "根据pk查找用户", notes = "返回用户实体对象", response = User.class, position = 2)
	@ResponseBody
	@RequestMapping(value = { "/{userPk}" }, method = RequestMethod.GET)
	public ResponseEntity<User> findByPk(
			@ApiParam(value = "填写Pk", allowableValues = "range[1,5]", required = true, defaultValue = "userPk", allowMultiple = true) @PathVariable("userPk") Integer userPk) {
		return new ResponseEntity<User>(service.findByPk(userPk), HttpStatus.OK);
	}
	
	/**
	 * 测试
	 * @param who
	 * @return
	 */
	@ApiOperation(value = "Hellow World", notes = "测试功能", position = 1)
	@ResponseBody
	@RequestMapping(value = { "/hello/{who}" }, method = RequestMethod.GET)
	public String hello(
			@ApiParam(value = "填写名称") @PathVariable("who") String who) {
		return "Hello guys" + " " + who + "!";
	}

	/**
	 * 查询所有
	 * @return
	 */
	@ApiOperation(value = "获取所有用户", notes = "返回用户实体对象集合", position = 5)
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<User> getAll() {
		return service.findAll();
	}
	
	@ApiOperation(value = "更新用户", notes = "返回更新的用户实体对象",position = 5)
	@RequestMapping(value = "/update/{userPk}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateByPk(
			@PathVariable("userPk") Integer userPk, @RequestBody User user) {
		user.setPk_user(userPk);
		service.update(user);
		Result<User> result = ResultUtil.buildSuccessResult(user);
		return new ResponseEntity<Result<User>>(result, HttpStatus.OK);
	}

}
