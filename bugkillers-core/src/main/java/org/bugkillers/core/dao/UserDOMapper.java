package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.UserDO;

public interface UserDOMapper {
    /**
     *  根据主键删除数据库的记录,bk_user
     *
     * @param id
     */
    @Delete({
        "delete from bk_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,bk_user
     *
     * @param record
     */
    @Insert({
        "insert into bk_user (id, user_name, ",
        "nick_name, password, ",
        "email, head_pic, ",
        "regist_time, login_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{nickName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{headPic,jdbcType=VARCHAR}, ",
        "#{registTime,jdbcType=TIMESTAMP}, #{loginTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(UserDO record);

    /**
     *  动态字段,写入数据库记录,bk_user
     *
     * @param record
     */
    int insertSelective(UserDO record);

    /**
     *  根据指定主键获取一条数据库记录,bk_user
     *
     * @param id
     */
    @Select({
        "select",
        "id, user_name, nick_name, password, email, head_pic, regist_time, login_time, ",
        "bk_create, bk_modified, dr",
        "from bk_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
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
    @Update({
        "update bk_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "head_pic = #{headPic,jdbcType=VARCHAR},",
          "regist_time = #{registTime,jdbcType=TIMESTAMP},",
          "login_time = #{loginTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserDO record);
}