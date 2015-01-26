package org.bugkillers.back.user.dao;

import java.util.List;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.dao.Mapper;

public interface UserMapper extends Mapper<User>{
	public int save(User user);
	public int update(User user);
	public int delete(int pk_user);
	public User findByPk(int pk_user);
	public List<User> findAll();
}
