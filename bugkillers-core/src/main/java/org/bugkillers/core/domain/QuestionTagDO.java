package org.bugkillers.core.domain;

import java.util.Date;

public class QuestionTagDO {
    /**
     *  主键,所属表字段为bk_question_tag.id
     */
    private Integer id;

    /**
     *  标签主键,所属表字段为bk_question_tag.tag_id
     */
    private Integer tagId;

    /**
     *  标签名称,所属表字段为bk_question_tag.tag_name
     */
    private String tagName;

    /**
     *  问题主键,所属表字段为bk_question_tag.question_id
     */
    private Integer questionId;

    /**
     *  ,所属表字段为bk_question_tag.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_question_tag.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_question_tag.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_question_tag.id
     *
     * @return bk_question_tag.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_question_tag.id
     *
     * @param id bk_question_tag.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标签主键 字段:bk_question_tag.tag_id
     *
     * @return bk_question_tag.tag_id, 标签主键
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置 标签主键 字段:bk_question_tag.tag_id
     *
     * @param tagId bk_question_tag.tag_id, 标签主键
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取 标签名称 字段:bk_question_tag.tag_name
     *
     * @return bk_question_tag.tag_name, 标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置 标签名称 字段:bk_question_tag.tag_name
     *
     * @param tagName bk_question_tag.tag_name, 标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * 获取 问题主键 字段:bk_question_tag.question_id
     *
     * @return bk_question_tag.question_id, 问题主键
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置 问题主键 字段:bk_question_tag.question_id
     *
     * @param questionId bk_question_tag.question_id, 问题主键
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取  字段:bk_question_tag.bk_create
     *
     * @return bk_question_tag.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_question_tag.bk_create
     *
     * @param bkCreate bk_question_tag.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_question_tag.bk_modified
     *
     * @return bk_question_tag.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_question_tag.bk_modified
     *
     * @param bkModified bk_question_tag.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_question_tag.dr
     *
     * @return bk_question_tag.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_question_tag.dr
     *
     * @param dr bk_question_tag.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}