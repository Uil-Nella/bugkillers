package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.QuestionDO;

public interface QuestionDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_question
     *
     * @param id
     */
    @Delete({
        "delete from bk_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_question
     *
     * @param record
     */
    @Insert({
        "insert into bk_question (id, tag_id, ",
        "user_id, question_text, ",
        "create_time, update_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{tagId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{questionText,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(QuestionDO record);

    /**
     *  动态字段,写入数据库记录,bk_question
     *
     * @param record
     */
    int insertSelective(QuestionDO record);

    /**
     *  根据指定主键获取一条数据库记录,bk_question
     *
     * @param id
     */
    @Select({
        "select",
        "id, tag_id, user_id, question_text, create_time, update_time, bk_create, bk_modified, ",
        "dr",
        "from bk_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
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
    @Update({
        "update bk_question",
        "set tag_id = #{tagId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "question_text = #{questionText,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(QuestionDO record);
}