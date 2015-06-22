package org.bugkillers.core.domain;

import java.util.Date;

public class QuestionDO {
    /**
     *  主键,所属表字段为bk_question.id
     */
    private Integer id;

    /**
     *  问题所属者主键,所属表字段为bk_question.user_id
     */
    private Integer userId;

    /**
     *  问题标题,所属表字段为bk_question.question_title
     */
    private String questionTitle;

    /**
     *  问题摘要,所属表字段为bk_question.question_summary
     */
    private String questionSummary;

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
    private Integer dr;

    /**
     * 获取 主键 字段:bk_question.id
     *
     * @return bk_question.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_question.id
     *
     * @param id bk_question.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 设置 问题所属者主键 字段:bk_question.user_id
     *
     * @param userId bk_question.user_id, 问题所属者主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 问题标题 字段:bk_question.question_title
     *
     * @return bk_question.question_title, 问题标题
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * 设置 问题标题 字段:bk_question.question_title
     *
     * @param questionTitle bk_question.question_title, 问题标题
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle == null ? null : questionTitle.trim();
    }

    /**
     * 获取 问题摘要 字段:bk_question.question_summary
     *
     * @return bk_question.question_summary, 问题摘要
     */
    public String getQuestionSummary() {
        return questionSummary;
    }

    /**
     * 设置 问题摘要 字段:bk_question.question_summary
     *
     * @param questionSummary bk_question.question_summary, 问题摘要
     */
    public void setQuestionSummary(String questionSummary) {
        this.questionSummary = questionSummary == null ? null : questionSummary.trim();
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
     * 设置 问题正文 字段:bk_question.question_text
     *
     * @param questionText bk_question.question_text, 问题正文
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText == null ? null : questionText.trim();
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
     * 设置  字段:bk_question.create_time
     *
     * @param createTime bk_question.create_time, 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 设置  字段:bk_question.update_time
     *
     * @param updateTime bk_question.update_time, 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * 设置  字段:bk_question.bk_create
     *
     * @param bkCreate bk_question.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
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
     * 设置  字段:bk_question.bk_modified
     *
     * @param bkModified bk_question.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_question.dr
     *
     * @return bk_question.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_question.dr
     *
     * @param dr bk_question.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}