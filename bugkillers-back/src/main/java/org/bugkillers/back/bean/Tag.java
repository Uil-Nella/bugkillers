package org.bugkillers.back.bean;
/**
 * 标签
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月26日 上午9:20:36
 * <p> @version 0.0.1
 */
public class Tag {
	/**
	 * 标签主键
	 */
	private Integer pk_tag;   
	/**
	 * 标签名称
	 */
	private String name;
	public int getPk_tag() {
		return pk_tag;
	}
	public void setPk_tag(Integer pk_tag) {
		this.pk_tag = pk_tag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tag [pk_tag=" + pk_tag + ", name=" + name + "]";
	}
	public Tag() {
		super();
	}
	public Tag(Integer pk_tag, String name) {
		super();
		this.pk_tag = pk_tag;
		this.name = name;
	}   
	
	
}
