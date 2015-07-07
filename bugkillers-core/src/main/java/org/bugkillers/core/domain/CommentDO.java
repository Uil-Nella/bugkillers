package org.bugkillers.core.domain;

import java.util.Date;

public class CommentDO {
    /**
     *  主键,所属表字段为bk_comment.id
     */
    private Integer id;

    /**
     *  问题主键,所属表字段为bk_comment.question_id
     */
    private Integer questionId;

    /**
     *  问题所属者主键,所属表字段为bk_comment.user_id
     */
    private Integer userId;

    /**
     *  评论正文,所属表字段为bk_comment.comment_text
     */
    private String commentText;

    /**
     *  ,所属表字段为bk_comment.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_comment.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_comment.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_comment.id
     *
     * @return bk_comment.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_comment.id
     *
     * @param id bk_comment.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 问题主键 字段:bk_comment.question_id
     *
     * @return bk_comment.question_id, 问题主键
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置 问题主键 字段:bk_comment.question_id
     *
     * @param questionId bk_comment.question_id, 问题主键
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取 问题所属者主键 字段:bk_comment.user_id
     *
     * @return bk_comment.user_id, 问题所属者主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 问题所属者主键 字段:bk_comment.user_id
     *
     * @param userId bk_comment.user_id, 问题所属者主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 评论正文 字段:bk_comment.comment_text
     *
     * @return bk_comment.comment_text, 评论正文
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * 设置 评论正文 字段:bk_comment.comment_text
     *
     * @param commentText bk_comment.comment_text, 评论正文
     */
    public void setCommentText(String commentText) {
        this.commentText = commentText == null ? null : commentText.trim();
    }

    /**
     * 获取  字段:bk_comment.bk_create
     *
     * @return bk_comment.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_comment.bk_create
     *
     * @param bkCreate bk_comment.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_comment.bk_modified
     *
     * @return bk_comment.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_comment.bk_modified
     *
     * @param bkModified bk_comment.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_comment.dr
     *
     * @return bk_comment.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_comment.dr
     *
     * @param dr bk_comment.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}