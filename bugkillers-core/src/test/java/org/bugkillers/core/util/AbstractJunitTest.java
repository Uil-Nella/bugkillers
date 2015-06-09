package org.bugkillers.core.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.sql.DataSource;

import static org.junit.Assert.assertTrue;

/**
 * Spring用来做Dao junit的基础类，其他测试类继承此类即可
 *
 * @author lxy
 * @version 1.0
 * @created
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(defaultRollback = true)
@ContextConfiguration(locations = { "classpath*:/spring/spring/spring-config.xml" })
public abstract class AbstractJunitTest extends
        AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    @Qualifier("dataSource")
    @Override public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
    @Test
    public void emptyTest(){
        assertTrue(true);
    }
}
