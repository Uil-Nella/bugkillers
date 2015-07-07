package org.bugkillers.core.domain;

import java.util.Date;

public class TagDO {
    /**
     *  主键,所属表字段为bk_tag.id
     */
    private Integer id;

    /**
     *  标签名,所属表字段为bk_tag.tag_name
     */
    private String tagName;

    /**
     *  标签图片,所属表字段为bk_tag.tag_pic
     */
    private String tagPic;

    /**
     *  标签描述信息,所属表字段为bk_tag.tag_des
     */
    private String tagDes;

    /**
     *  标签组主键,所属表字段为bk_tag.group_id
     */
    private Integer groupId;

    /**
     *  ,所属表字段为bk_tag.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_tag.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_tag.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_tag.id
     *
     * @return bk_tag.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_tag.id
     *
     * @param id bk_tag.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 标签名 字段:bk_tag.tag_name
     *
     * @return bk_tag.tag_name, 标签名
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置 标签名 字段:bk_tag.tag_name
     *
     * @param tagName bk_tag.tag_name, 标签名
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * 获取 标签图片 字段:bk_tag.tag_pic
     *
     * @return bk_tag.tag_pic, 标签图片
     */
    public String getTagPic() {
        return tagPic;
    }

    /**
     * 设置 标签图片 字段:bk_tag.tag_pic
     *
     * @param tagPic bk_tag.tag_pic, 标签图片
     */
    public void setTagPic(String tagPic) {
        this.tagPic = tagPic == null ? null : tagPic.trim();
    }

    /**
     * 获取 标签描述信息 字段:bk_tag.tag_des
     *
     * @return bk_tag.tag_des, 标签描述信息
     */
    public String getTagDes() {
        return tagDes;
    }

    /**
     * 设置 标签描述信息 字段:bk_tag.tag_des
     *
     * @param tagDes bk_tag.tag_des, 标签描述信息
     */
    public void setTagDes(String tagDes) {
        this.tagDes = tagDes == null ? null : tagDes.trim();
    }

    /**
     * 获取 标签组主键 字段:bk_tag.group_id
     *
     * @return bk_tag.group_id, 标签组主键
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置 标签组主键 字段:bk_tag.group_id
     *
     * @param groupId bk_tag.group_id, 标签组主键
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取  字段:bk_tag.bk_create
     *
     * @return bk_tag.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_tag.bk_create
     *
     * @param bkCreate bk_tag.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_tag.bk_modified
     *
     * @return bk_tag.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_tag.bk_modified
     *
     * @param bkModified bk_tag.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_tag.dr
     *
     * @return bk_tag.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_tag.dr
     *
     * @param dr bk_tag.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}