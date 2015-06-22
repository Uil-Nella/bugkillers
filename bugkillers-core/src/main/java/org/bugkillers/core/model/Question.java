package org.bugkillers.core.model;

import java.util.Date;
import java.util.List;

/**
 * Created by liuxinyu on 15/6/22.
 */
public class Question {
    /**
     *  主键,所属表字段为bk_question.id
     */
    private Integer id;

    /**
     *  问题的提问者
     */
    private User user;

    /**
     * 问题所属标签
     */
    private List<Tag> tags;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionSummary() {
        return questionSummary;
    }

    public void setQuestionSummary(String questionSummary) {
        this.questionSummary = questionSummary;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
