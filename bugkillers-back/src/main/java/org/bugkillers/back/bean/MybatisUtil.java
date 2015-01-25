package org.bugkillers.back.bean;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.bugkillers.back.test.TestUser;

public class MybatisUtil {
	public static SqlSessionFactory getFactory(){
		return new SqlSessionFactoryBuilder().build(TestUser.class.getClassLoader().getResourceAsStream("conf.xml"));
	}
}
