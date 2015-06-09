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
     *  ,所属表字段为bk_comment.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为bk_comment.update_time
     */
    private Date updateTime;

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
    private Byte dr;

    /**
     *  构造查询条件,bk_comment
     */
    public CommentDO(Integer id, Integer questionId, Integer userId, String commentText, Date createTime, Date updateTime, Date bkCreate, Date bkModified, Byte dr) {
        this.id = id;
        this.questionId = questionId;
        this.userId = userId;
        this.commentText = commentText;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.bkCreate = bkCreate;
        this.bkModified = bkModified;
        this.dr = dr;
    }

    /**
     * 获取 主键 字段:bk_comment.id
     *
     * @return bk_comment.id, 主键
     */
    public Integer getId() {
        return id;
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
     * 获取 问题所属者主键 字段:bk_comment.user_id
     *
     * @return bk_comment.user_id, 问题所属者主键
     */
    public Integer getUserId() {
        return userId;
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
     * 获取  字段:bk_comment.create_time
     *
     * @return bk_comment.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 获取  字段:bk_comment.update_time
     *
     * @return bk_comment.update_time, 
     */
    public Date getUpdateTime() {
        return updateTime;
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
     * 获取  字段:bk_comment.bk_modified
     *
     * @return bk_comment.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_comment.dr
     *
     * @return bk_comment.dr, 1=正常  2=删除
     */
    public Byte getDr() {
        return dr;
    }
}