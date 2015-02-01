package org.bugkillers.back.question.controller;

import org.bugkillers.back.bean.Question;
import org.bugkillers.back.question.service.QuestionService;
import org.bugkillers.back.result.Result;
import org.bugkillers.back.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * 用户操作Controller
 * <p/>
 * <p>
 * 
 * @author 刘新宇
 *
 *         <p>
 * @date 2015年1月30日 上午10:50:34
 *       <p>
 * @version 0.0.1
 */
@Api(value = "question-api", description = "有关于问题的CURD操作", position = 5)
@Controller
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService service;

	
	/**
	 * 根据pk查找问题
	 * @param questionPk
	 * @return
	 */
	@ApiOperation(value = "根据pk查找问题", notes = "返回问题实体对象", response = Question.class, position = 2)
	@ResponseBody
	@RequestMapping(value = { "/{questionPk}" }, method = RequestMethod.GET)
	public ResponseEntity<?> findByPk(
			@ApiParam(value = "填写Pk", allowableValues = "range[1,5]", required = true, defaultValue = "questionPk", allowMultiple = true) @PathVariable("questionPk") Integer questionPk) {
		Result<Question> result = ResultUtil.buildSuccessResult(service.findByPk(questionPk));
		return new ResponseEntity<Result<Question>>(result, HttpStatus.OK);
	}
	
	

	/**
	 * 查询所有
	 * @return
	 */
//	@ApiOperation(value = "获取所有用户", notes = "返回用户实体对象集合", position = 5)
//	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
//	public @ResponseBody ResponseEntity<?>  findAll() {
//		Result<List<User>> result = ResultUtil.buildSuccessResult( service.findAll());
//		return  new ResponseEntity<Result<List<User>>>(result, HttpStatus.OK);
//	}
	


}
