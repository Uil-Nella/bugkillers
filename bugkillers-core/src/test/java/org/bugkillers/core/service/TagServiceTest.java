package org.bugkillers.core.service;

import org.bugkillers.core.model.Tag;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuxinyu on 15/7/13.
 */
public class TagServiceTest extends AbstractJunitTest{
    @Autowired
    private ITagService tagService;

    @Test
    public void createOrModifiedTest01(){
        Tag tag = new Tag();
        tag.setTagName("Java");
        tag.setTagDes("Java集合2313");
        tag.setTagPic("url:/sfsfsdfs");
        tagService.createOrModifiedTag(tag);
        Assert.assertTrue(true);
    }

    @Test
    public void createOrModifiedTest02(){
        Tag tag = new Tag();
        tag.setTagName("Java");
        tag.setTagDes("Java集");
        tag.setTagPic("url:/sfsfsdfs");
        tag.setId(1);
        tagService.createOrModifiedTag(tag);
        Assert.assertTrue(true);
    }

    @Test
    public void findById(){
        tagService.findTagById(1);
        Assert.assertTrue(true);
    }

    @Test
    public void findAll(){
        tagService.findAllTags();
        Assert.assertTrue(true);
    }
}
