package org.bugkillers.core.service;

import org.bugkillers.core.model.Question;
import org.bugkillers.core.model.Tag;
import org.bugkillers.core.model.User;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;

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

    @Test
    public void createOrModifiedTest(){
        Question question = new Question();
        User user = new User();
        user.setId(111);
        question.setUser(user);
        question.setQuestionTitle("hahah");
        question.setQuestionSummary("hh");
        question.setQuestionText("1414fasfasdgasgdfsg dfg sdfg sdfggsgsdfgs");
        Tag tag = new Tag();
        tag.setId(1);
        tag.setTagName("java");
        question.setTags(Arrays.asList(tag));
        questionService.createOrModifiedQuestion(question);
        Assert.assertTrue(true);
    }
}
