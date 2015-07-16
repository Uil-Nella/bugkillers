package org.bugkillers.core.controller;

import org.bugkillers.core.model.Tag;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by liuxinyu on 15/7/13.
 */
@Controller
@RequestMapping("/bugkillers/tag")
public class TagController {

    @Autowired
    private ITagService tagService;

    /**
     * 创建或修改标签
     * @param tag
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    ResponseEntity<?> createOrModifiedTag(@RequestBody Tag tag){
        BaseResult<Tag> result=tagService.createOrModifiedTag(tag);
        return new ResponseEntity<BaseResult<Tag>>(result, HttpStatus.OK);
    }

    /**
     * 根据标签id获取
     * @param tagId
     * @return
     */
    @RequestMapping(value = "/{tagId}",method = RequestMethod.GET)
    @ResponseBody
    ResponseEntity<?> findTagById(@RequestParam int tagId){
        BaseResult<Tag> result=tagService.findTagById(tagId);
        return new ResponseEntity<BaseResult<Tag>>(result, HttpStatus.OK);
    }

    /**
     * 获取所有tag集合
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    ResponseEntity<?> findAllTags(){
        BaseResult<List<Tag>> result=tagService.findAllTags();
        return new ResponseEntity<BaseResult<List<Tag>>>(result, HttpStatus.OK);
    }

    /**
     * 根据标签id删除
     * @return
     */
    @RequestMapping(value = "/{tagId}",method = RequestMethod.DELETE)
    @ResponseBody
    ResponseEntity<?> deleteTagById(@RequestParam int tagId){
        BaseResult<Tag> result=tagService.deleteTagById(tagId);
        return new ResponseEntity<BaseResult<Tag>>(result, HttpStatus.OK);
    }
}
