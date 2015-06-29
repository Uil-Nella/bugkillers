package org.bugkillers.core.result;

/**
 * 抽象的返回结果
 * Created by liuxinyu on 15/6/9.
 */
public class BaseResult<T> {
    /**
     * 返回标示位
     */
    private boolean ret;
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误信息
     */
    private String msg;

    /**
     * 返回的数据信息
     */
    private T t;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
