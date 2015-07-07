package org.bugkillers.core.dao;

import java.util.List;
import org.bugkillers.core.domain.PrestigeDO;
import org.bugkillers.core.domain.PrestigeDOExample;

public interface PrestigeDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_prestige
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_prestige
     *
     * @param record
     */
    int insert(PrestigeDO record);

    /**
     *  动态字段,写入数据库记录,bk_prestige
     *
     * @param record
     */
    int insertSelective(PrestigeDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,bk_prestige
     *
     * @param example
     */
    List<PrestigeDO> selectByExample(PrestigeDOExample example);

    /**
     *  根据指定主键获取一条数据库记录,bk_prestige
     *
     * @param id
     */
    PrestigeDO selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,bk_prestige
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PrestigeDO record);

    /**
     *  根据主键来更新符合条件的数据库记录,bk_prestige
     *
     * @param record
     */
    int updateByPrimaryKey(PrestigeDO record);
}