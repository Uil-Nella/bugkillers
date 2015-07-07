package org.bugkillers.core.domain;

import java.util.Date;

public class TagUserDO {
    /**
     *  主键,所属表字段为bk_tag_user.id
     */
    private Integer id;

    /**
     *  标签主键,所属表字段为bk_tag_user.tag_id
     */
    private Integer tagId;

    /**
     *  用户主键,所属表字段为bk_tag_user.user_id
     */
    private Integer userId;

    /**
     *  ,所属表字段为bk_tag_user.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_tag_user.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_tag_user.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_tag_user.id
     *
     * @return bk_tag_user.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_tag_user.id
     *
     * @param id bk_tag_user.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标签主键 字段:bk_tag_user.tag_id
     *
     * @return bk_tag_user.tag_id, 标签主键
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置 标签主键 字段:bk_tag_user.tag_id
     *
     * @param tagId bk_tag_user.tag_id, 标签主键
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取 用户主键 字段:bk_tag_user.user_id
     *
     * @return bk_tag_user.user_id, 用户主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 用户主键 字段:bk_tag_user.user_id
     *
     * @param userId bk_tag_user.user_id, 用户主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取  字段:bk_tag_user.bk_create
     *
     * @return bk_tag_user.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_tag_user.bk_create
     *
     * @param bkCreate bk_tag_user.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_tag_user.bk_modified
     *
     * @return bk_tag_user.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_tag_user.bk_modified
     *
     * @param bkModified bk_tag_user.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_tag_user.dr
     *
     * @return bk_tag_user.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_tag_user.dr
     *
     * @param dr bk_tag_user.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}