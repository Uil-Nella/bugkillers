package org.bugkillers.back.comment;

import org.bugkillers.back.bean.User;
import org.bugkillers.back.comment.dao.CommentMapper;
import org.bugkillers.back.user.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 用户DAO测试
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:16:04
 * <p> @version 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/bean.xml") //加载配置
public class TestCommentDAO {
	
	@Autowired //注入
	private CommentMapper commentMapper;
//	@Test
//	public void save(){
//		User user = createUser();
//		System.out.println(commentMapper.save(user));
//		System.out.println(user.getPk_user());
//		
//	}
//	@Test
//	public void delete(){
////		System.out.println(userMapper.delete(4));
//	}
//	@Test
//	public void udpate(){
////		User user = createUser();
////		user.setPk_user(3);
////		user.setName("lxy");
////		user.setNickname("老刘");
////		System.out.println(userMapper.update(user));
//	}
	@Test
	public void find(){
		System.out.println(commentMapper.findByPk(1));
	}
//	@Test
//	public void findAll(){
//		System.out.println(commentMapper.findAll());
//	}
//	private User createUser() {
//		User user = new User();
//		user.setName("刘新宇");
//		user.setPassword("lxy");
//		return user;
//	}
}
