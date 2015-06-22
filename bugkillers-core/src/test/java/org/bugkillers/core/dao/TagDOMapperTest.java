package org.bugkillers.core.dao;

import org.bugkillers.core.domain.TagDO;
import org.bugkillers.core.enums.DataValidEnum;
import org.bugkillers.core.util.AbstractJunitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/22.
 */
public class TagDOMapperTest extends AbstractJunitTest{

    @Autowired
    private TagDOMapper tagDOMapper;

    @Test
    public void insertTest(){
        TagDO tagDO = new TagDO();
        tagDO.setTagName("Java");
        tagDO.setBkCreate(new Date());
        tagDO.setBkModified(new Date());
        tagDO.setDr(DataValidEnum.VALID.getIndex());
        tagDOMapper.insert(tagDO);
        Assert.assertTrue(true);
    }

    @Test
    public void insertTest02(){
        TagDO tagDO = new TagDO();
        tagDO.setTagName("Spring");
        tagDO.setBkCreate(new Date());
        tagDO.setBkModified(new Date());
        tagDO.setDr(DataValidEnum.VALID.getIndex());
        tagDOMapper.insert(tagDO);
        Assert.assertTrue(true);
    }
    @Test
    public void insertTest03(){
        TagDO tagDO = new TagDO();
        tagDO.setTagName("Python");
        tagDO.setBkCreate(new Date());
        tagDO.setBkModified(new Date());
        tagDO.setDr(DataValidEnum.VALID.getIndex());
        tagDOMapper.insert(tagDO);
        Assert.assertTrue(true);
    }
}
