package org.bugkillers.core.model;

public class Tag {
    /**
     *  主键,所属表字段为bk_tag.id
     */
    private Integer id;

    /**
     *  标签名,所属表字段为bk_tag.tag_name
     */
    private String tagName;

    private String tagPic;

    private String tagDes;

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

    public String getTagPic() {
        return tagPic;
    }

    public void setTagPic(String tagPic) {
        this.tagPic = tagPic;
    }

    public String getTagDes() {
        return tagDes;
    }

    public void setTagDes(String tagDes) {
        this.tagDes = tagDes;
    }
}