package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.CommentDO;

public interface CommentDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_comment
     *
     * @param id
     */
    @Delete({
        "delete from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_comment
     *
     * @param record
     */
    @Insert({
        "insert into bk_comment (id, question_id, ",
        "user_id, comment_text, ",
        "create_time, update_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{commentText,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(CommentDO record);

    /**
     *  动态字段,写入数据库记录,bk_comment
     *
     * @param record
     */
    int insertSelective(CommentDO record);

    /**
     *  根据指定主键获取一条数据库记录,bk_comment
     *
     * @param id
     */
    @Select({
        "select",
        "id, question_id, user_id, comment_text, create_time, update_time, bk_create, ",
        "bk_modified, dr",
        "from bk_comment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
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
    @Update({
        "update bk_comment",
        "set question_id = #{questionId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "comment_text = #{commentText,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommentDO record);
}