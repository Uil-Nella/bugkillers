package org.bugkillers.core.service;

import org.bugkillers.core.model.Question;

import java.util.List;

/**
 * Created by liuxinyu on 15/6/22.
 */
public interface IQuestionService {
    /**
     * 根据id查询问题
     * @param id
     * @return
     */
    Question findById(Integer id);

    /**
     * 通过标签查找一组问题
     * @param tagId
     * @return
     */
    List<Question> findByTagId(Integer tagId);

    /**
     * 查询最新创建的 offset 个问题
     * @param offset
     * @return
     */
    List<Question> filterByCreate(Integer offset);



}
