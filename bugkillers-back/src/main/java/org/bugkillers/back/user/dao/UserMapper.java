package org.bugkillers.back.user.dao;

import java.util.List;

import org.bugkillers.back.bean.User;

public interface UserMapper {
	public void save(User user);
	public int update(User user);
	public int delete(int pk_user);
	public User findByPk(int pk_user);
	public List<User> findAllUsers();
}
