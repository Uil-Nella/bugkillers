package org.bugkillers.core.domain;

import java.util.Date;

public class PrestigeDO {
    /**
     *  主键,所属表字段为bk_prestige.id
     */
    private Integer id;

    /**
     *  用户主键,所属表字段为bk_prestige.user_id
     */
    private Integer userId;

    /**
     *  声望值,所属表字段为bk_prestige.presige_value
     */
    private Integer presigeValue;

    /**
     *  被赞次数,所属表字段为bk_prestige.zan_value
     */
    private Integer zanValue;

    /**
     *  ,所属表字段为bk_prestige.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_prestige.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_prestige.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_prestige.id
     *
     * @return bk_prestige.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_prestige.id
     *
     * @param id bk_prestige.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户主键 字段:bk_prestige.user_id
     *
     * @return bk_prestige.user_id, 用户主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置 用户主键 字段:bk_prestige.user_id
     *
     * @param userId bk_prestige.user_id, 用户主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取 声望值 字段:bk_prestige.presige_value
     *
     * @return bk_prestige.presige_value, 声望值
     */
    public Integer getPresigeValue() {
        return presigeValue;
    }

    /**
     * 设置 声望值 字段:bk_prestige.presige_value
     *
     * @param presigeValue bk_prestige.presige_value, 声望值
     */
    public void setPresigeValue(Integer presigeValue) {
        this.presigeValue = presigeValue;
    }

    /**
     * 获取 被赞次数 字段:bk_prestige.zan_value
     *
     * @return bk_prestige.zan_value, 被赞次数
     */
    public Integer getZanValue() {
        return zanValue;
    }

    /**
     * 设置 被赞次数 字段:bk_prestige.zan_value
     *
     * @param zanValue bk_prestige.zan_value, 被赞次数
     */
    public void setZanValue(Integer zanValue) {
        this.zanValue = zanValue;
    }

    /**
     * 获取  字段:bk_prestige.bk_create
     *
     * @return bk_prestige.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_prestige.bk_create
     *
     * @param bkCreate bk_prestige.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_prestige.bk_modified
     *
     * @return bk_prestige.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_prestige.bk_modified
     *
     * @param bkModified bk_prestige.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_prestige.dr
     *
     * @return bk_prestige.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_prestige.dr
     *
     * @param dr bk_prestige.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}