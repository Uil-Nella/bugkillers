package org.bugkillers.core.result;

/**
 * 抽象的返回结果
 * Created by liuxinyu on 15/6/9.
 */
public abstract  class BaseResult<T> {
    /**
     * 返回标示位
     */
    private boolean ret;
    /**
     * 错误码
     */
    private String errCode;
    /**
     * 错误信息
     */
    private String errMsg;

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

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
