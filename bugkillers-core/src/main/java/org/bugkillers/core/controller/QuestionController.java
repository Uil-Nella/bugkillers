package org.bugkillers.core.controller;

import org.bugkillers.core.constants.LogConstants;
import org.bugkillers.core.model.Question;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.IQuestionService;
import org.bugkillers.core.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuxinyu on 15/6/22.
 */
@Controller
@RequestMapping("/bugkillers/question")
public class QuestionController {

    @Autowired
    private IQuestionService questionService;
    /**
     * 根据pk找问题
     *
     * @param questionId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = {"/{questionId}"}, method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable("questionId") Integer questionId) {
        Question question = new Question();
        try {
            question = questionService.findById(questionId);
        } catch (Exception e) {
            LogConstants.SERVICE_LOGGER.error("查找失败", e);
        }
        BaseResult<Question> result = ResultUtil.buildSuccessResult(question);
        return new ResponseEntity<BaseResult<Question>>(result, HttpStatus.OK);
    }



}
