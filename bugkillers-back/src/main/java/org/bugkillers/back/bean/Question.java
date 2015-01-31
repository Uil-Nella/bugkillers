package org.bugkillers.back.bean;

import java.util.List;
/**
 * 问题
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:07:15
 * <p> @version 0.0.1
 */
public class Question {
	/**
	 * 问题主键
	 */
	private Integer pk_question;
	/**
	 * 问题标签
	 */
	private List<Tag> tags;    
	/**
	 * 提问人
	 */
	private User createuser;    
	/**
	 * 提问时间
	 */
	private String createtime;   
	/**
	 * 更新时间
	 */
	private String updatetime;  
	/**
	 * 更新人pk
	 */
	private User updateuser;   
	/**
	 * 被查看次数
	 */
	private String lookedtimes;  
	/**
	 * 删除标示位
	 */
	private String dr;     
	/**
	 * 问题正文
	 */
	private String text;
	/**
	 *  关注者
	 */
	private List<User> observers;
	
	public Integer getPk_question() {
		return pk_question;
	}
	public void setPk_question(Integer pk_question) {
		this.pk_question = pk_question;
	}
	public User getCreateuser() {
		return createuser;
	}
	public void setCreateuser(User createuser) {
		this.createuser = createuser;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public User getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(User updateuser) {
		this.updateuser = updateuser;
	}
	public String getLookedtimes() {
		return lookedtimes;
	}
	public void setLookedtimes(String lookedtimes) {
		this.lookedtimes = lookedtimes;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<User> getObservers() {
		return observers;
	}
	public void setObservers(List<User> observers) {
		this.observers = observers;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Question [pk_question=" + pk_question + ", tags=" + tags
				+ ", createuser=" + createuser + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + ", updateuser=" + updateuser
				+ ", lookedtimes=" + lookedtimes + ", dr=" + dr + ", text="
				+ text + ", observers=" + observers + "]";
	}
	
}
