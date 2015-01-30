package org.bugkillers.back.bean;


/**
 * 用户表
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月26日 上午9:17:20
 * <p> @version 0.0.1
 */
public class User {
	/**
	 * 用户主键
	 */
	private int pk_user;    
	/**
	 * 用户名
	 */
	private String name;   
	/**
	 * 昵称
	 */
	private String nickname;   
	/**
	 * 密码
	 */
	private String password;   
	/**
	 * 邮箱
	 */
	private String  email; 
	/**
	 * 删除标示位
	 */
	private String  dr;
	/**
	 * 注册时间
	 */
	private String  registtime; 
	/**
	 * 最近登录时间
	 */
	private String  logintime;  
	/**
	 * 头像
	 */
	private String  headpic;
	public int getPk_user() {
		return pk_user;
	}
	public void setPk_user(int pk_user) {
		this.pk_user = pk_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	public String getRegisttime() {
		return registtime;
	}
	public void setRegisttime(String registtime) {
		this.registtime = registtime;
	}
	public String getLogintime() {
		return logintime;
	}
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	public String getHeadpic() {
		return headpic;
	}
	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}
	public User(String name, String nickname, String password) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [pk_user=" + pk_user + ", name=" + name + ", nickname="
				+ nickname + ", password=" + password + ", email=" + email
				+ ", dr=" + dr + ", registtime=" + registtime + ", logintime="
				+ logintime + ", headpic=" + headpic + "]";
	}    
	
	
	
}
