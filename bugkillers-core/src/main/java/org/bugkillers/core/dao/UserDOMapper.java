package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.domain.UserDOExample;

public interface UserDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_user
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_user
     *
     * @param record
     */
    int insert(UserDO record);

    /**
     *  动态字段,写入数据库记录,bk_user
     *
     * @param record
     */
    int insertSelective(UserDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_user
     *
     * @param example
     */
    List<UserDO> selectByExample(UserDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_user
     *
     * @param id
     */
    UserDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_user
     *
     * @param record
     */
    int updateByPrimaryKey(UserDO record);
}