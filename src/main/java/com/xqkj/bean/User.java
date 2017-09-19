package com.xqkj.bean;

public class User {

    private int id;
    private String loginName;
    private String loginPwd;
    private String name;
    private String roleId;
    private String isActive;

    public User() {

    }

    public User(int id, String loginName, String loginPwd, String name, String roleId, String isActive) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.name = name;
        this.roleId = roleId;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}
