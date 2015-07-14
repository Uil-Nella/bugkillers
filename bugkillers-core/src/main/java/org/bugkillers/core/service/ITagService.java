package org.bugkillers.core.service;

import org.bugkillers.core.model.Tag;
import org.bugkillers.core.result.BaseResult;

import java.util.List;

/**
 * Created by liuxinyu on 15/7/13.
 */
public interface ITagService {

    /**
     * 创建或修改标签
     * @param tag
     * @return
     */
    BaseResult<Tag> createOrModifiedTag(Tag tag);

    /**
     * 根据标签id获取
     * @param tagId
     * @return
     */
    BaseResult<Tag> findTagById(int tagId);

    /**
     * 获取所有tag集合
     * @return
     */
    BaseResult<List<Tag>> findAllTags();

    /**
     * 根据标签id删除
     * @return
     */
    BaseResult<Tag> deleteTagById(int tagId);
}
