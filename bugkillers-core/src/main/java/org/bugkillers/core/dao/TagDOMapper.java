package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.TagDO;
import org.bugkillers.core.domain.TagDOExample;

public interface TagDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_tag
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_tag
     *
     * @param record
     */
    int insert(TagDO record);

    /**
     *  动态字段,写入数据库记录,bk_tag
     *
     * @param record
     */
    int insertSelective(TagDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_tag
     *
     * @param example
     */
    List<TagDO> selectByExample(TagDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_tag
     *
     * @param id
     */
    TagDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_tag
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TagDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_tag
     *
     * @param record
     */
    int updateByPrimaryKey(TagDO record);
}