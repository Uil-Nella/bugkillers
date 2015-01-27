package org.bugkillers.back.service;

import java.util.List;
/**
 * 后台服务接口
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:09:12
 * <p> @version 0.0.1
 */
public interface IService<T> {
	/**
	 * 存储
	 * @param t
	 * @return
	 */
	public boolean save(T t);
	/**
	 * 更新
	 * @param t
	 * @return
	 */
	public boolean update(T t);
	/**
	 * 删除
	 * @param pk
	 * @return
	 */
	public boolean delete(int pk);
	/**
	 * 根据PK查找
	 * @param pk
	 * @return
	 */
	public T findByPk(int pk);
	/**
	 * 查找所有
	 * @return
	 */
	public List<T> findAll();
}
