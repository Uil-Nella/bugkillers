package org.bugkillers.core.domain;

import java.util.Date;

public class QuestionDO {
    /**
     *  主键,所属表字段为bk_question.id
     */
    private Integer id;

    /**
     *  标签主键,所属表字段为bk_question.tag_id
     */
    private Integer tagId;

    /**
     *  问题所属者主键,所属表字段为bk_question.user_id
     */
    private Integer userId;

    /**
     *  问题正文,所属表字段为bk_question.question_text
     */
    private String questionText;

    /**
     *  ,所属表字段为bk_question.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为bk_question.update_time
     */
    private Date updateTime;

    /**
     *  ,所属表字段为bk_question.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_question.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_question.dr
     */
    private Byte dr;

    /**
     *  构造查询条件,bk_question
     */
    public QuestionDO(Integer id, Integer tagId, Integer userId, String questionText, Date createTime, Date updateTime, Date bkCreate, Date bkModified, Byte dr) {
        this.id = id;
        this.tagId = tagId;
        this.userId = userId;
        this.questionText = questionText;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.bkCreate = bkCreate;
        this.bkModified = bkModified;
        this.dr = dr;
    }

    /**
     * 获取 主键 字段:bk_question.id
     *
     * @return bk_question.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 获取 标签主键 字段:bk_question.tag_id
     *
     * @return bk_question.tag_id, 标签主键
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 获取 问题所属者主键 字段:bk_question.user_id
     *
     * @return bk_question.user_id, 问题所属者主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 获取 问题正文 字段:bk_question.question_text
     *
     * @return bk_question.question_text, 问题正文
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * 获取  字段:bk_question.create_time
     *
     * @return bk_question.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 获取  字段:bk_question.update_time
     *
     * @return bk_question.update_time, 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 获取  字段:bk_question.bk_create
     *
     * @return bk_question.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 获取  字段:bk_question.bk_modified
     *
     * @return bk_question.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_question.dr
     *
     * @return bk_question.dr, 1=正常  2=删除
     */
    public Byte getDr() {
        return dr;
    }
}