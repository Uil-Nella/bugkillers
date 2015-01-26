package org.bugkillers.back.dao;

import java.util.List;


public interface Mapper<T> {
	public int save(T t);
	public int update(T t);
	public int delete(int pk);
	public T findByPk(int pk);
	public List<T> findAll();
}
