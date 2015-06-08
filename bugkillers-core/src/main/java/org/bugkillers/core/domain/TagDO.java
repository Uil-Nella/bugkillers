package org.bugkillers.core.domain;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/3.
 */
public class TagDO {
    private Integer id;
    private String tagName;
    private Integer dr;
    private Date bkCreate;
    private Date bkModefied;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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

    @Override
    public String toString() {
        return "TagDO{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", dr=" + dr +
                ", bkCreate=" + bkCreate +
                ", bkModefied=" + bkModefied +
                '}';
    }
}
