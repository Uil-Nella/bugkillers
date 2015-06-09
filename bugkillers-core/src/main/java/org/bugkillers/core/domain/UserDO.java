package org.bugkillers.core.domain;

import java.util.Date;

public class UserDO {
    /**
     *  主键,所属表字段为bk_user.id
     */
    private Integer id;

    /**
     *  用户名,所属表字段为bk_user.user_name
     */
    private String userName;

    /**
     *  昵称,所属表字段为bk_user.nick_name
     */
    private String nickName;

    /**
     *  密码,所属表字段为bk_user.password
     */
    private String password;

    /**
     *  邮箱,所属表字段为bk_user.email
     */
    private String email;

    /**
     *  头像路径,所属表字段为bk_user.head_pic
     */
    private String headPic;

    /**
     *  ,所属表字段为bk_user.regist_time
     */
    private Date registTime;

    /**
     *  ,所属表字段为bk_user.login_time
     */
    private Date loginTime;

    /**
     *  ,所属表字段为bk_user.bk_create
     */
    private Date bkCreate;

    /**
     *  ,所属表字段为bk_user.bk_modified
     */
    private Date bkModified;

    /**
     *  1=正常  2=删除,所属表字段为bk_user.dr
     */
    private Integer dr;

    /**
     * 获取 主键 字段:bk_user.id
     *
     * @return bk_user.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:bk_user.id
     *
     * @param id bk_user.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 用户名 字段:bk_user.user_name
     *
     * @return bk_user.user_name, 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名 字段:bk_user.user_name
     *
     * @param userName bk_user.user_name, 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 昵称 字段:bk_user.nick_name
     *
     * @return bk_user.nick_name, 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置 昵称 字段:bk_user.nick_name
     *
     * @param nickName bk_user.nick_name, 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取 密码 字段:bk_user.password
     *
     * @return bk_user.password, 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码 字段:bk_user.password
     *
     * @param password bk_user.password, 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取 邮箱 字段:bk_user.email
     *
     * @return bk_user.email, 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱 字段:bk_user.email
     *
     * @param email bk_user.email, 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 头像路径 字段:bk_user.head_pic
     *
     * @return bk_user.head_pic, 头像路径
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * 设置 头像路径 字段:bk_user.head_pic
     *
     * @param headPic bk_user.head_pic, 头像路径
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    /**
     * 获取  字段:bk_user.regist_time
     *
     * @return bk_user.regist_time, 
     */
    public Date getRegistTime() {
        return registTime;
    }

    /**
     * 设置  字段:bk_user.regist_time
     *
     * @param registTime bk_user.regist_time, 
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    /**
     * 获取  字段:bk_user.login_time
     *
     * @return bk_user.login_time, 
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置  字段:bk_user.login_time
     *
     * @param loginTime bk_user.login_time, 
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取  字段:bk_user.bk_create
     *
     * @return bk_user.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
    }

    /**
     * 设置  字段:bk_user.bk_create
     *
     * @param bkCreate bk_user.bk_create, 
     */
    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    /**
     * 获取  字段:bk_user.bk_modified
     *
     * @return bk_user.bk_modified, 
     */
    public Date getBkModified() {
        return bkModified;
    }

    /**
     * 设置  字段:bk_user.bk_modified
     *
     * @param bkModified bk_user.bk_modified, 
     */
    public void setBkModified(Date bkModified) {
        this.bkModified = bkModified;
    }

    /**
     * 获取 1=正常  2=删除 字段:bk_user.dr
     *
     * @return bk_user.dr, 1=正常  2=删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 设置 1=正常  2=删除 字段:bk_user.dr
     *
     * @param dr bk_user.dr, 1=正常  2=删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}