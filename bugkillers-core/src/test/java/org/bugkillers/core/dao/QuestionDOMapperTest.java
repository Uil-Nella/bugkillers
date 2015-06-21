package org.bugkillers.core.dao;

import org.bugkillers.core.domain.QuestionDO;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Test;

/**
 * Created by liuxinyu on 15/6/21.
 */
public class QuestionDOMapperTest extends AbstractJunitTest {

    @Test
    public void insertTest(){
        QuestionDO questionDO = new QuestionDO();
        questionDO.setTagId(1);
        questionDO.setDr(1);
        questionDO.setUserId(1);
        questionDO.setQuestionText("Java 虚拟机");
    }
}
