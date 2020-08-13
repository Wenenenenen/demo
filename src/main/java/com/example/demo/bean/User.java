package com.example.demo.bean;

public class User {
    private int id;
    private String account;
    private String password;
    private int roleid;
    private String admincode;
    private String username;
    private String phone;
    private String telphone;
    private String email;
    private String unit;
    private String logincount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLogincount() {
        return logincount;
    }

    public void setLogincount(String logincount) {
        this.logincount = logincount;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", roleid=" + roleid +
                ", admincode='" + admincode + '\'' +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", telphone='" + telphone + '\'' +
                ", email='" + email + '\'' +
                ", unit='" + unit + '\'' +
                ", logincount='" + logincount + '\'' +
                '}';
    }
}
