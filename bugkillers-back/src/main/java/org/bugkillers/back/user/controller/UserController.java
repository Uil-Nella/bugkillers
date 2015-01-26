package org.bugkillers.back.user.controller;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping(value = { "/regist.do" }, method = RequestMethod.GET)
	public void regist(User user){
		service.save(user);
	}
	@RequestMapping(value = { "/find.do" }, method = RequestMethod.GET)
	public void find(){
		
	}
	
	public String hello(){
		return "Hello guys";
	}
}
