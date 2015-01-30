package org.bugkillers.back.result;

public class Result<T> {
	private T obj;
	private String errcode;
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
