package org.bugkillers.core.service.impl;

import com.google.common.collect.Lists;
import org.bugkillers.core.dao.TagDOMapper;
import org.bugkillers.core.domain.TagDO;
import org.bugkillers.core.domain.TagDOExample;
import org.bugkillers.core.model.Tag;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.ITagService;
import org.bugkillers.core.util.BeanMapper;
import org.bugkillers.core.util.FillAttributeUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liuxinyu on 15/7/13.
 */
public class TagServiceImpl implements ITagService {
    @Autowired
    private BeanMapper beanMapper;

    @Autowired
    private TagDOMapper tagDOMapper;
    /**
     * 创建或修改标签
     *
     * @param tag
     * @return
     */
    @Override
    public BaseResult<Tag> createOrModifiedTag(Tag tag) {
        //校验
        BaseResult<Tag> result = new BaseResult<>();
        TagDO tagDO = new TagDO();
        beanMapper.copy(tag, tagDO);
        //TODO 二期再做
        tagDO.setGroupId(1);
        FillAttributeUtil.fillNecessaryAttribute(tagDO, TagDO.class);
        tagDOMapper.insert(tagDO);
        //result 处理
        return result.setRet(true);
    }

    /**
     * 根据标签id获取
     *
     * @param tagId
     * @return
     */
    @Override
    public BaseResult<Tag> findTagById(int tagId) {
        Tag tag = new Tag();
        BaseResult<Tag> result = new BaseResult<>();
        TagDO dbTagDO = tagDOMapper.selectByPrimaryKey(tagId);
        beanMapper.copy(dbTagDO,tag);
        return result.setRet(true).setT(tag);
    }

    /**
     * 获取所有tag集合
     *
     * @return
     */
    @Override
    public BaseResult<List<Tag>> findAllTags() {
        BaseResult<List<Tag>> result = new BaseResult<>();
        List<Tag> tags = Lists.newArrayList();
        TagDOExample tagDOExample = new TagDOExample();
        tagDOExample.or().andBkCreateIsNotNull();
        List<TagDO> tagDOs = tagDOMapper.selectByExample(tagDOExample);
        tags = beanMapper.mapList(tagDOs,Tag.class);
        return result.setRet(true).setT(tags);
    }

    /**
     * 根据标签id删除
     *
     * @return
     */
    @Override
    public BaseResult<Tag> deleteTagById(int tagId) {
        BaseResult<Tag> result = new BaseResult<>();
        tagDOMapper.deleteByPrimaryKey(tagId);
        return result.setRet(true);
    }
}
