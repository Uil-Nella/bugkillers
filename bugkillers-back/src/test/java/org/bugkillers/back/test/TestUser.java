package org.bugkillers.back.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.bugkillers.back.bean.MybatisUtil;
import org.bugkillers.back.bean.User２;
import org.junit.Test;

public class TestUser {
	public static void main(String[] args) {
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(TestUser.class.getClassLoader().getResourceAsStream("conf.xml"));
//		SqlSession session = factory.openSession();
		
		//查询
//		String statement = "org.bugkillers.back.bean.userMapper"+".getUser";
//		//执行查询返回一个唯一user 对象的sql
//		User user = session.selectOne(statement, 1);
//		System.out.println(user);
//		session.selectOne(statement);
		
		//增加
//		String statement = "org.bugkillers.back.bean.userMapper"+".addUser";
//		int insert = session.insert(statement, new User(2,"dh",22));
//		System.out.println(insert);
//		session.commit();
		
		//修改
//		SqlSessionFactory factory = MybatisUtil.getFactory();
//		SqlSession session = factory.openSession();
//		String statement = "org.bugkillers.back.bean.userMapper"+".updateUser";
//		int insert = session.update(statement, new User(2,"dh",28));
//		System.out.println(insert);
//		session.commit();
		
		//查询所有
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession();
		String statement = "org.bugkillers.back.bean.userMapper"+".getAllUsers";
		List<User２> list= session.selectList(statement);
		System.out.println(list);
		session.commit();
	
	
	}
	@Test
	public void TestUpdate(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession();
		String statement = "org.bugkillers.back.bean.userMapper"+".updateUser";
		int insert = session.update(statement, new User２(2,"dh",28));
		System.out.println(insert);
		session.commit();
	}
}
