package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.TagGroupDO;
import org.bugkillers.core.domain.TagGroupDOExample;

public interface TagGroupDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_tag_group
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_tag_group
     *
     * @param record
     */
    int insert(TagGroupDO record);

    /**
     *  动态字段,写入数据库记录,bk_tag_group
     *
     * @param record
     */
    int insertSelective(TagGroupDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_tag_group
     *
     * @param example
     */
    List<TagGroupDO> selectByExample(TagGroupDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_tag_group
     *
     * @param id
     */
    TagGroupDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_tag_group
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TagGroupDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_tag_group
     *
     * @param record
     */
    int updateByPrimaryKey(TagGroupDO record);
}