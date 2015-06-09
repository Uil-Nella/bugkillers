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
    private Byte dr;

    /**
     *  构造查询条件,bk_tag
     */
    public TagDO(Integer id, String tagName, Date bkCreate, Date bkModified, Byte dr) {
        this.id = id;
        this.tagName = tagName;
        this.bkCreate = bkCreate;
        this.bkModified = bkModified;
        this.dr = dr;
    }

    /**
     * 获取 主键 字段:bk_tag.id
     *
     * @return bk_tag.id, 主键
     */
    public Integer getId() {
        return id;
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
     * 获取  字段:bk_tag.bk_create
     *
     * @return bk_tag.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
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
     * 获取 1=正常  2=删除 字段:bk_tag.dr
     *
     * @return bk_tag.dr, 1=正常  2=删除
     */
    public Byte getDr() {
        return dr;
    }
}