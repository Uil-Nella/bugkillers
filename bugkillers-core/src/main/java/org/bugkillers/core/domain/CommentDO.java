package org.bugkillers.core.domain;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/3.
 */
public class CommentDO {
    private Integer id;
    private Integer quesionId;
    private String text;
    private Integer userId;
    private Date createTime;
    private Date updateTime;
    private Integer dr;
    private Date bkCreate;
    private Date bkModefied;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuesionId() {
        return quesionId;
    }

    public void setQuesionId(Integer quesionId) {
        this.quesionId = quesionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Date getBkCreate() {
        return bkCreate;
    }

    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    public Date getBkModefied() {
        return bkModefied;
    }

    public void setBkModefied(Date bkModefied) {
        this.bkModefied = bkModefied;
    }
}
