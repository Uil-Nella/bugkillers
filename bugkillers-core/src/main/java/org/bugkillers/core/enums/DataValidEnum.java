package org.bugkillers.core.enums;

/**
 * Created by liuxinyu on 15/6/9.
 */
public enum DataValidEnum {
    VALID(1, "有效"),
    INVALID( 2, "无效");

    private int index;
    private String desc;

    private DataValidEnum(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
