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
    private Byte dr;

    /**
     *  构造查询条件,bk_user
     */
    public UserDO(Integer id, String userName, String nickName, String password, String email, String headPic, Date registTime, Date loginTime, Date bkCreate, Date bkModified, Byte dr) {
        this.id = id;
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
        this.email = email;
        this.headPic = headPic;
        this.registTime = registTime;
        this.loginTime = loginTime;
        this.bkCreate = bkCreate;
        this.bkModified = bkModified;
        this.dr = dr;
    }

    /**
     * 获取 主键 字段:bk_user.id
     *
     * @return bk_user.id, 主键
     */
    public Integer getId() {
        return id;
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
     * 获取 昵称 字段:bk_user.nick_name
     *
     * @return bk_user.nick_name, 昵称
     */
    public String getNickName() {
        return nickName;
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
     * 获取 邮箱 字段:bk_user.email
     *
     * @return bk_user.email, 邮箱
     */
    public String getEmail() {
        return email;
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
     * 获取  字段:bk_user.regist_time
     *
     * @return bk_user.regist_time, 
     */
    public Date getRegistTime() {
        return registTime;
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
     * 获取  字段:bk_user.bk_create
     *
     * @return bk_user.bk_create, 
     */
    public Date getBkCreate() {
        return bkCreate;
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
     * 获取 1=正常  2=删除 字段:bk_user.dr
     *
     * @return bk_user.dr, 1=正常  2=删除
     */
    public Byte getDr() {
        return dr;
    }
}