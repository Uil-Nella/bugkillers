package org.bugkillers.back.dao;

import java.util.List;

/**
 * Mybatis数据库操作持久化接口
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:07:29
 * <p> @version 0.0.1
 */
public interface Mapper<T> {
	/**
	 * 保存
	 * @param t
	 * @return
	 */
	public int save(T t);
	/**
	 * 修改
	 * @param t
	 * @return
	 */
	public int update(T t);
	/**
	 * 删除
	 * @param pk
	 * @return
	 */
	public int delete(int pk);
	/**
	 * 根据Pk查询
	 * @param pk
	 * @return
	 */
	public T findByPk(int pk);
	/**
	 * 查询所有
	 * @return
	 */
	public List<T> findAll();
}
