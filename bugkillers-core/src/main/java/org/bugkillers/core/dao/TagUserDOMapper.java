package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.TagUserDO;
import org.bugkillers.core.domain.TagUserDOExample;

public interface TagUserDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_tag_user
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_tag_user
     *
     * @param record
     */
    int insert(TagUserDO record);

    /**
     *  动态字段,写入数据库记录,bk_tag_user
     *
     * @param record
     */
    int insertSelective(TagUserDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_tag_user
     *
     * @param example
     */
    List<TagUserDO> selectByExample(TagUserDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_tag_user
     *
     * @param id
     */
    TagUserDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_tag_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TagUserDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_tag_user
     *
     * @param record
     */
    int updateByPrimaryKey(TagUserDO record);
}