package org.bugkillers.back.user.controller;

import org.bugkillers.back.bean.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
public class IndexController {
	@RequestMapping(value = "/api/index", method = RequestMethod.GET)
	public String api() {
		return "/api/index";
	}

//	@ApiOperation(value = "Create Account", notes = "Sweet Blah",
//			response = User.class, nickname = "AccountCreation2", 
//			produces = "application/json,application/xml", 
//			consumes = "application/json,application/xml")
//	@ApiImplicitParams(value = {
//			@ApiImplicitParam(name = "body", value = "Sweet Blah", required = true, paramType = "body", dataType = "org.bugkillers.back.bean.User"),
//			@ApiImplicitParam(name = "accountId", value = "provides account Id for the new"
//					+ "account", required = true, paramType = "path", dataType = "Integer") })
//	@RequestMapping(value = "/accounts/{accountId}", method = RequestMethod.PUT)
//	public ResponseEntity<?> createAccount(
//			@PathVariable("accountId") Integer accountId, @RequestBody User acct) {
//		return null;
//	}

	@ApiOperation(value = "Test API", notes = "测试API方法",
			response = String.class, nickname = "测试", 
			produces = "application/json,application/xml", 
			consumes = "application/json, application/xml")
	@ApiImplicitParams(value = {
			@ApiImplicitParam(name = "name", value = "提供名称",
					required = true, paramType = "path", dataType = "String") })
	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public ResponseEntity<?> testAPI(@PathVariable("name") String name){
//		return "hello"+","+name;
		return null;
	}
	
//	@ApiOperation(value = "Test UserAPI", notes = "测试API方法",
//			response = String.class, nickname = "测试", 
//			produces = "application/json,application/xml", 
//			consumes = "application/json, application/xml")
//	@ApiImplicitParam(name = "body", value = "Sweet Blah", required = true, paramType = "body", dataType = "org.bugkillers.back.bean.User")
//	@RequestMapping(value = "/test/add", method = RequestMethod.GET)
//	public ResponseEntity<?> testUserAPI( @RequestBody User acct){
////		return "hello"+","+name;
//		return null;
//	}
//	
	
	
}
