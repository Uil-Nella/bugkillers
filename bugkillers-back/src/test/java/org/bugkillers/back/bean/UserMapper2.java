package org.bugkillers.back.bean;

import java.util.List;

public interface UserMapper2 {
	
	public void add(User２ user);
	
	public int deleteById(int id);
	
	public int update(User２ user);
	
	public User２ getById(int id);
	
	public List<User２> getAll();
}
