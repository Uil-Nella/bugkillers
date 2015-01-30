package org.bugkillers.back.result;
/**
 * 请求结果集
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月30日 下午1:17:06
 * <p> @version 0.0.1
 */
public class Result<T> {
	/**
	 * 结果集对象
	 */
	private T obj;
	/**
	 * 响应编码
	 */
	private String errcode;
	/**
	 * 响应信息
	 */
	private String errmsg;
	
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	@Override
	public String toString() {
		return "Result [errcode=" + errcode + ", errmsg=" + errmsg + ", obj=" + obj + "]";
	}
	
	
	
}
