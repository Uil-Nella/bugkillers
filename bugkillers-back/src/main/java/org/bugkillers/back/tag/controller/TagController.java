package org.bugkillers.back.tag.controller;

import java.util.List;

import org.bugkillers.back.bean.Tag;
import org.bugkillers.back.result.Result;
import org.bugkillers.back.tag.service.TagService;
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
 * 标签操作Controller
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
@Api(value = "tag-api", description = "有关于标签的CURD操作", position = 5)
@Controller
@RequestMapping("/tag")
public class TagController {
	@Autowired
	private TagService service;
	/**
	 * 注册用户
	 * @param tag
	 */
	@ApiOperation(value = "添加标签", notes = "添加标签", position = 3)
	@ResponseBody
	@RequestMapping(value = { "/add" }, method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Tag tag) {
		service.save(tag);
		Result<String> result = ResultUtil.buildSuccessResult("添加成功");
		return new ResponseEntity<Result<String>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据pk查找标签
	 * @param tagPk
	 * @return
	 */
	@ApiOperation(value = "根据pk查找标签", notes = "返回标签实体对象", response = Tag.class, position = 2)
	@ResponseBody
	@RequestMapping(value = { "/{tagPk}" }, method = RequestMethod.GET)
	public ResponseEntity<?> findByPk(
			@ApiParam(value = "填写Pk", allowableValues = "range[1,5]", required = true, defaultValue = "tagPk", allowMultiple = true) @PathVariable("tagPk") Integer tagPk) {
		Result<Tag> result = ResultUtil.buildSuccessResult(service.findByPk(tagPk));
		return new ResponseEntity<Result<Tag>>(result, HttpStatus.OK);
	}
	

	/**
	 * 查询所有
	 * @return
	 */
	@ApiOperation(value = "获取所有标签", notes = "返回标签实体对象集合", position = 5)
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?>  findAll() {
		Result<List<Tag>> result = ResultUtil.buildSuccessResult( service.findAll());
		return  new ResponseEntity<Result<List<Tag>>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据标签pk更新实体
	 * @param tagPk  标签pk
	 * @param tag 返回更新后的实体
	 * @return
	 */
	@ApiOperation(value = "更新标签", notes = "返回更新的标签实体对象",position = 5)
	@RequestMapping(value = "/update/{tagPk}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateByPk(
			@PathVariable("tagPk") Integer tagPk, @RequestBody Tag tag) {
		tag.setPk_tag(tagPk);
		service.update(tag);
		Result<Tag> result = ResultUtil.buildSuccessResult(tag);
		return new ResponseEntity<Result<Tag>>(result, HttpStatus.OK);
	}
	
	/**
	 * 根据标签pk删除实体
	 * @param userPk  用户pk
	 * @return
	 */
	@ApiOperation(value = "删除标签", notes = "根据pk删除标签",position = 6)
	@RequestMapping(value = "/delete/{tagPk}", method = RequestMethod.GET)
	public ResponseEntity<?> deleteByPk(
			@PathVariable("tagPk") Integer tagPk) {
		service.delete(tagPk);
		Result<String> result = ResultUtil.buildSuccessResult("删除成功");
		return new ResponseEntity<Result<String>>(result, HttpStatus.OK);
	}

 }
