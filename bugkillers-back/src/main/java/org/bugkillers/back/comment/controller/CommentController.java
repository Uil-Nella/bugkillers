package org.bugkillers.back.comment.controller;

import java.util.List;

import org.bugkillers.back.bean.Comment;
import org.bugkillers.back.comment.service.CommentService;
import org.bugkillers.back.result.Result;
import org.bugkillers.back.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * 评论操作Controller
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
@Api(value = "comment-api", description = "有关于评论的CURD操作", position = 5)
@Controller
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	private CommentService service;
	/**
	 * 添加评论
	 * @param comment
	 */
	@ApiOperation(value = "添加评论", notes = "添加评论", position = 3)
	@ResponseBody
	@RequestMapping(value = { "/add" }, method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Comment comment) {
		service.save(comment);
		Result<String> result = ResultUtil.buildSuccessResult("添加成功");
		return new ResponseEntity<Result<String>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据pk查找评论
	 * @param commentPk
	 * @return
	 */
	@ApiOperation(value = "根据pk查找评论", notes = "返回评论", response = Comment.class, position = 2)
	@ResponseBody
	@RequestMapping(value = { "/{commentPk}" }, method = RequestMethod.GET)
	public ResponseEntity<?> findByPk(
			@ApiParam(value = "填写Pk", allowableValues = "range[1,5]", required = true, defaultValue = "commentPk", allowMultiple = true) @PathVariable("commentPk") Integer commentPk) {
		Result<Comment> result = ResultUtil.buildSuccessResult(service.findByPk(commentPk));
		return new ResponseEntity<Result<Comment>>(result, HttpStatus.OK);
	}
	
	

	/**
	 * 查询所有
	 * @return
	 */
	@ApiOperation(value = "获取所有评论", notes = "返回评论实体对象集合", position = 5)
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?>  findAll() {
		Result<List<Comment>> result = ResultUtil.buildSuccessResult( service.findAll());
		return  new ResponseEntity<Result<List<Comment>>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据pk更新实体
	 * @param commentPk  pk
	 * @param comment 返回更新后的实体
	 * @return
	 */
	@ApiOperation(value = "更新用户", notes = "返回更新的用户实体对象",position = 5)
	@RequestMapping(value = "/update/{commentPk}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateByPk(
			@PathVariable("commentPk") Integer commentPk, @RequestBody Comment comment) {
		comment.setPk_comment(commentPk);
		service.update(comment);
		Result<Comment> result = ResultUtil.buildSuccessResult(comment);
		return new ResponseEntity<Result<Comment>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据用户pk删除实体
	 * @param commentPk  pk
	 * @return
	 */
	@ApiOperation(value = "删除评论", notes = "根据pk删除评论",position = 5)
	@RequestMapping(value = "/delete/{commentPk}", method = RequestMethod.GET)
	public ResponseEntity<?> deleteByPk(
			@PathVariable("commentPk") Integer commentPk) {
		service.delete(commentPk);
		Result<String> result = ResultUtil.buildSuccessResult("删除成功");
		return new ResponseEntity<Result<String>>(result, HttpStatus.OK);
	}

}
