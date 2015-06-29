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

    public BaseResult<T> setRet(boolean ret) {
        this.ret = ret;
        return this;
    }

    public String getCode() {
        return code;
    }

    public BaseResult<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BaseResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getT() {
        return t;
    }

    public BaseResult<T> setT(T t) {
        this.t = t;
        return this;
    }

}
