package org.bugkillers.core.util;


import org.bugkillers.core.result.BaseResult;

/**
 * 結果集返回构造工具类
 */
public class ResultUtil {

    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MSG = "success";

    public static <T> BaseResult<T> buildResult(T t) {
        BaseResult<T> BaseResult = new BaseResult<T>();
        BaseResult.setT(t);
        return BaseResult;
    }

    /**
     * 成功
     * @param t
     * @param <T>
     * @return
     */
    public static <T> BaseResult<T> buildSuccessResult(T t) {
        BaseResult<T> BaseResult = new BaseResult<T>();
        BaseResult.setT(t);
        BaseResult.setCode(SUCCESS_CODE);
        BaseResult.setMsg(SUCCESS_MSG);
        return BaseResult;
    }

    /**
     * 失败
     * @param t
     * @param Code
     * @param Msg
     * @param <T>
     * @return
     */
    public static <T> BaseResult<T> buildErrorResult(T t, int Code, String Msg) {
        BaseResult<T> BaseResult = new BaseResult<T>();
        BaseResult.setT(t);
        BaseResult.setCode(Code);
        BaseResult.setMsg(Msg);
        return BaseResult;
    }
}
