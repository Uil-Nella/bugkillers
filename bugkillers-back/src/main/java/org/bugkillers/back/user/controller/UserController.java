package org.bugkillers.back.user.controller;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
@Api(value="user-api", description="有关于用户的CURD操作", position = 0)
@EnableSwagger
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@ApiOperation(value = "regist", position = 1)
	@ApiImplicitParam(name = "body", value = "Sweet Blah", required = true, paramType = "body", dataType = "org.bugkillers.back.bean.User")
	@ResponseBody
	@RequestMapping(value = { "/regist" }, method = RequestMethod.POST)
	public void regist( @RequestBody User user){
		service.save(user);
	}
	@ApiOperation(value = "根据pk查找用户",  notes = "Returns a pet when ID < 10. "
			+ "ID > 10 or nonintegers will simulate API error conditions",response=User.class)
	@ApiResponses(value = {@ApiResponse(code = 405, message = "Invalid input")})
	@ResponseBody
	@RequestMapping(value = { "/{userPk}" }, method = RequestMethod.GET)
	public User findByPk(@ApiParam(value = "ID of pet that needs to be fetched",  allowableValues = "range[1,5]", required = true
	,defaultValue = "userPk",allowMultiple = true) @PathVariable("userPk") @RequestParam("userPk")String userPk){
		return new User("hahh","哈哈","嘿嘿");
		
	}
	
	
	
	
	
	@ApiOperation(value = "hello", position = 3)
	@ApiResponses(value = {@ApiResponse(code = 405, message = "Invalid input")})
	@ResponseBody
	@RequestMapping(value = { "/hello.do" }, method = RequestMethod.GET)
	public String hello(@ApiParam String who){
		return "Hello guys";
	}
	
}
