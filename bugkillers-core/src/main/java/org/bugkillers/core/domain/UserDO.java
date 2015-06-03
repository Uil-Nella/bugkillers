package org.bugkillers.core.domain;

import java.util.Date;

/**
 * Created by liuxinyu on 15/6/3.
 */
public class UserDO {
    private Integer id;
    private String userName;
    private String nickName;
    private String passWord;
    private String email;
    private Date registTime;
    private Date loginTime;
    private String headPic;
    private Integer dr;
    private Date bkCreate;
    private Date bkModefied;

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Date getBkCreate() {
        return bkCreate;
    }

    public void setBkCreate(Date bkCreate) {
        this.bkCreate = bkCreate;
    }

    public Date getBkModefied() {
        return bkModefied;
    }

    public void setBkModefied(Date bkModefied) {
        this.bkModefied = bkModefied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDO userDO = (UserDO) o;

        if (id != null ? !id.equals(userDO.id) : userDO.id != null) return false;
        if (userName != null ? !userName.equals(userDO.userName) : userDO.userName != null) return false;
        if (nickName != null ? !nickName.equals(userDO.nickName) : userDO.nickName != null) return false;
        if (passWord != null ? !passWord.equals(userDO.passWord) : userDO.passWord != null) return false;
        if (email != null ? !email.equals(userDO.email) : userDO.email != null) return false;
        if (dr != null ? !dr.equals(userDO.dr) : userDO.dr != null) return false;
        if (registTime != null ? !registTime.equals(userDO.registTime) : userDO.registTime != null) return false;
        if (loginTime != null ? !loginTime.equals(userDO.loginTime) : userDO.loginTime != null) return false;
        if (headPic != null ? !headPic.equals(userDO.headPic) : userDO.headPic != null) return false;
        if (bkCreate != null ? !bkCreate.equals(userDO.bkCreate) : userDO.bkCreate != null) return false;
        return !(bkModefied != null ? !bkModefied.equals(userDO.bkModefied) : userDO.bkModefied != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dr != null ? dr.hashCode() : 0);
        result = 31 * result + (registTime != null ? registTime.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (headPic != null ? headPic.hashCode() : 0);
        result = 31 * result + (bkCreate != null ? bkCreate.hashCode() : 0);
        result = 31 * result + (bkModefied != null ? bkModefied.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", dr=" + dr +
                ", registTime=" + registTime +
                ", loginTime=" + loginTime +
                ", headPic='" + headPic + '\'' +
                ", bkCreate=" + bkCreate +
                ", bkModefied=" + bkModefied +
                '}';
    }
}
