package org.bugkillers.back.service;

import java.util.List;

public interface IService<T> {
	public boolean save(T t);
	public boolean update(T t);
	public boolean delete(int pk);
	public T findByPk(int pk);
	public List<T> findAll();
}
