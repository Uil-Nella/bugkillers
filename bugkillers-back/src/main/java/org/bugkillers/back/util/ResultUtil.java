package org.bugkillers.back.util;

import org.bugkillers.back.result.Result;

public class ResultUtil {
	
	public static final String SUCCESS_CODE = "0";
	public static final String SUCCESS_MSG = "success";
	public static <T> Result<T> buildResult(T t){
		Result<T> result = new Result<T>();
		result.setObj(t);
		return result;
	}
	
	public static <T> Result<T> buildSuccessResult(T t){
		Result<T> result = new Result<T>();
		result.setObj(t);
		result.setErrcode(SUCCESS_CODE);
		result.setErrmsg(SUCCESS_MSG);
		return result;
	}
	
	public static <T> Result<T> buildErrorResult(T t,String errcode,String errmsg){
		Result<T> result = new Result<T>();
		result.setObj(t);
		result.setErrcode(errcode);
		result.setErrmsg(errmsg);
		return result;
	}
}
