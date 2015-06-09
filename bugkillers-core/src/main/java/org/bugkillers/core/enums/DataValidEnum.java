package org.bugkillers.core.enums;

/**
 * Created by liuxinyu on 15/6/9.
 */
public enum DataValidEnum {
    VALID((byte) 1, "有效"),
    INVALID((byte) 2, "无效");

    private byte index;
    private String desc;

    private DataValidEnum(byte index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public byte getIndex() {
        return index;
    }

    public void setIndex(byte index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
