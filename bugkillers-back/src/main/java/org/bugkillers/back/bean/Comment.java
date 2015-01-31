package org.bugkillers.back.bean;
/**
 * 评论
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月26日 上午9:24:25
 * <p> @version 0.0.1
 */
public class Comment {
	/**
	 * 评论主键
	 */
	private Integer pk_comment; 
	/**
	 * 所属问题pk
	 */
	private Question question;
	/**
	 * 评论内容
	 */
	private String text;   
	/**
	 * 评论人
	 */
	private User commentuser;  
	/**
	 * commenttime 评论时间
	 */
	private String commenttime; 
	/**
	 * 评论顺序
	 */
	private String order; 
	/**
	 * 删除标示位
	 */
	private String dr;
	public Integer getPk_comment() {
		return pk_comment;
	}
	public void setPk_comment(Integer pk_comment) {
		this.pk_comment = pk_comment;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getCommentuser() {
		return commentuser;
	}
	public void setCommentuser(User commentuser) {
		this.commentuser = commentuser;
	}
	public String getCommenttime() {
		return commenttime;
	}
	public void setommenttime(String commenttime) {
		this.commenttime = commenttime;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	@Override
	public String toString() {
		return "Comment [pk_comment=" + pk_comment + ", question=" + question
				+ ", text=" + text + ", commentuser=" + commentuser + ", commenttime="
				+ commenttime + ", order=" + order + ", dr=" + dr + "]";
	} 
	
}
