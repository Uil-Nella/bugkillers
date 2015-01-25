package org.bugkillers.back.bean;

import java.util.List;

public interface UserMapper2 {
	
	public void add(User user);
	
	public int deleteById(int id);
	
	public int update(User user);
	
	public User getById(int id);
	
	public List<User> getAll();
}
