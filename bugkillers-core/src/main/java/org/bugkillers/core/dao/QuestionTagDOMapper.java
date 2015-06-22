package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.QuestionTagDO;
import org.bugkillers.core.domain.QuestionTagDOExample;

public interface QuestionTagDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_question_tag
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_question_tag
     *
     * @param record
     */
    int insert(QuestionTagDO record);

    /**
     *  动态字段,写入数据库记录,bk_question_tag
     *
     * @param record
     */
    int insertSelective(QuestionTagDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_question_tag
     *
     * @param example
     */
    List<QuestionTagDO> selectByExample(QuestionTagDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_question_tag
     *
     * @param id
     */
    QuestionTagDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_question_tag
     *
     * @param record
     */
    int updateByPrimaryKeySelective(QuestionTagDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_question_tag
     *
     * @param record
     */
    int updateByPrimaryKey(QuestionTagDO record);
}