package org.bugkillers.back.user.controller;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
@Api(value="myapi", description="Operations on Businesses", position = 1)
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@ApiOperation(value = "regist", position = 1)
	@ResponseBody
	@RequestMapping(value = { "/regist.do" }, method = RequestMethod.GET)
	public void regist(User user){
		service.save(user);
	}
	@ApiOperation(value = "find", position = 2)
	@ResponseBody
	@RequestMapping(value = { "/find.do" }, method = RequestMethod.GET)
	public void find(){
		
		
	}
	@ApiOperation(value = "hello", position = 3)
	@ResponseBody
	@RequestMapping(value = { "/hello.do" }, method = RequestMethod.GET)
	public String hello(){
		return "Hello guys";
	}
	
}
