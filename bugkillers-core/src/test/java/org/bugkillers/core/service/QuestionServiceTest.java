package org.bugkillers.core.service;

import org.bugkillers.core.model.Question;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuxinyu on 15/6/22.
 */
public class QuestionServiceTest extends AbstractJunitTest {
    @Autowired
    private IQuestionService questionService;

    @Test
    public void findByIdTest(){
        Question question = questionService.findById(1);
        Assert.assertNotNull(question);
    }
}
