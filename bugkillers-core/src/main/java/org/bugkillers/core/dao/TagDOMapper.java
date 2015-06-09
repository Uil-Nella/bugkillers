package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.TagDO;

public interface TagDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_tag
     *
     * @param id
     */
    @Delete({
        "delete from bk_tag",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_tag
     *
     * @param record
     */
    @Insert({
        "insert into bk_tag (id, tag_name, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{tagName,jdbcType=VARCHAR}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(TagDO record);

    /**
     *  动态字段,写入数据库记录,bk_tag
     *
     * @param record
     */
    int insertSelective(TagDO record);

    /**
     *  根据指定主键获取一条数据库记录,bk_tag
     *
     * @param id
     */
    @Select({
        "select",
        "id, tag_name, bk_create, bk_modified, dr",
        "from bk_tag",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
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
    @Update({
        "update bk_tag",
        "set tag_name = #{tagName,jdbcType=VARCHAR},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TagDO record);
}