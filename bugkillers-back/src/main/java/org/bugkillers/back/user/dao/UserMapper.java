package org.bugkillers.back.user.dao;

import java.util.List;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.dao.Mapper;
/**
 * 用户操作Mapper
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:10:46
 * <p> @version 0.0.1
 */
public interface UserMapper extends Mapper<User>{
	public int save(User user);
	public int update(User user);
	public int delete(int pk_user);
	public User findByPk(int pk_user);
	public List<User> findAll();
}
