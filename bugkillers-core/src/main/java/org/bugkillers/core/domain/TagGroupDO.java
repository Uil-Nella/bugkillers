package org.bugkillers.core.domain;

import java.util.Date;

public class TagGroupDO {
    /**
     *  主键,所属表字段为bk_tag_group.id
     */
    private Integer id;

    /**
     *  标签组名称,所属表字段为bk_tag_group.group_name
     */
    private String groupName;

    /**
     *  标签组描述信息,所属表字段为bk_tag_group.group_des
     */
    private String groupDes;

    /**
     *  ,所属表字段为bk_tag_group.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_tag_group.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_tag_group.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_tag_group.id
     *
     * @return bk_tag_group.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_tag_group.id
     *
     * @param id bk_tag_group.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标签组名称 字段:bk_tag_group.group_name
     *
     * @return bk_tag_group.group_name, 标签组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置 标签组名称 字段:bk_tag_group.group_name
     *
     * @param groupName bk_tag_group.group_name, 标签组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 获取 标签组描述信息 字段:bk_tag_group.group_des
     *
     * @return bk_tag_group.group_des, 标签组描述信息
     */
    public String getGroupDes() {
        return groupDes;
    }

    /**
     * 设置 标签组描述信息 字段:bk_tag_group.group_des
     *
     * @param groupDes bk_tag_group.group_des, 标签组描述信息
     */
    public void setGroupDes(String groupDes) {
        this.groupDes = groupDes == null ? null : groupDes.trim();
    }

    /**
     * 获取  字段:bk_tag_group.bk_create
     *
     * @return bk_tag_group.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_tag_group.bk_create
     *
     * @param bkCreate bk_tag_group.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_tag_group.bk_modified
     *
     * @return bk_tag_group.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_tag_group.bk_modified
     *
     * @param bkModified bk_tag_group.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_tag_group.dr
     *
     * @return bk_tag_group.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_tag_group.dr
     *
     * @param dr bk_tag_group.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}