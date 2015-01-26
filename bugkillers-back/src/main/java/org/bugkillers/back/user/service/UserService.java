package org.bugkillers.back.user.service;

import org.bugkillers.back.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	@Autowired //注入
	private UserMapper userMapper;
}
