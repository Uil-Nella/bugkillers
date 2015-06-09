package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.QuestionDO;
import org.bugkillers.core.domain.QuestionDOExample;

public interface QuestionDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_question
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_question
     *
     * @param record
     */
    int insert(QuestionDO record);

    /**
     *  动态字段,写入数据库记录,bk_question
     *
     * @param record
     */
    int insertSelective(QuestionDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_question
     *
     * @param example
     */
    List<QuestionDO> selectByExample(QuestionDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_question
     *
     * @param id
     */
    QuestionDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_question
     *
     * @param record
     */
    int updateByPrimaryKeySelective(QuestionDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_question
     *
     * @param record
     */
    int updateByPrimaryKey(QuestionDO record);
}