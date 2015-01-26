package org.bugkillers.back.user.service;

import java.util.List;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.service.IService;
import org.bugkillers.back.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserService implements IService<User>{
	@Autowired //注入
	private UserMapper userMapper;

	@Override
	public boolean save(User t) {
		
		return userMapper.save(t)==0?false:true;
	}

	@Override
	public boolean update(User t) {
		return userMapper.update(t)==0?false:true;
	}

	@Override
	public boolean delete(int pk) {
		return userMapper.delete(pk)==0?false:true;
	}

	@Override
	public User findByPk(int pk) {
		return userMapper.findByPk(pk);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	
}
