package org.bugkillers.core.domain;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/3.
 */
public class QuestionDO {
    private Integer id;
    private Integer tagId;
    private Integer userId;
    private Date createTime;
    private Date updateTime;
    private String text;
    private Integer dr;
    private Date bkCreate;
    private Date bkModefied;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
