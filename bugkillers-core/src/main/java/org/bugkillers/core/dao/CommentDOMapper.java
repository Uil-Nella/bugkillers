package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.CommentDO;
import org.bugkillers.core.domain.CommentDOExample;

public interface CommentDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_comment
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_comment
     *
     * @param record
     */
    int insert(CommentDO record);

    /**
     *  动态字段,写入数据库记录,bk_comment
     *
     * @param record
     */
    int insertSelective(CommentDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_comment
     *
     * @param example
     */
    List<CommentDO> selectByExample(CommentDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_comment
     *
     * @param id
     */
    CommentDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_comment
     *
     * @param record
     */
    int updateByPrimaryKeySelective(CommentDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_comment
     *
     * @param record
     */
    int updateByPrimaryKey(CommentDO record);
}