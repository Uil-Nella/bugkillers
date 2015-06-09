package org.bugkillers.core.model;

/**
 * Created by liuxinyu on 15/6/9.
 */
public class User {
    /**
     *  主键
     */
    private Integer id;

    /**
     *  用户名
     */
    private String userName;

    /**
     *  昵称
     */
    private String nickName;

    /**
     *  密码
     */
    private String password;

    /**
     *  邮箱
     */
    private String email;

    /**
     *  头像路径
     */
    private String headPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", headPic='" + headPic + '\'' +
                '}';
    }
}
