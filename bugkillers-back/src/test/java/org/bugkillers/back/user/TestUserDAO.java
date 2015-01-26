package org.bugkillers.back.user;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.user.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/bean.xml") //加载配置
public class TestUserDAO {
	
	@Autowired //注入
	private UserMapper userMapper;
	@Test
	public void save(){
//		User user = createUser();
//		userMapper.save(user);
//		System.out.println(user.getPk_user());
	}
	@Test
	public void delete(){
//		System.out.println(userMapper.delete(4));
	}
	@Test
	public void udpate(){
//		User user = createUser();
//		user.setPk_user(3);
//		user.setName("lxy");
//		user.setNickname("老刘");
//		System.out.println(userMapper.update(user));
	}
	@Test
	public void find(){
		System.out.println(userMapper.findByPk(1));
	}
	@Test
	public void findAll(){
		System.out.println(userMapper.findAllUsers());
	}
	private User createUser() {
		User user = new User();
		user.setName("刘新宇");
		user.setPassword("lxy");
		return user;
	}
}
