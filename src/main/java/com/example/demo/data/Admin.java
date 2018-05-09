package com.example.demo.data;

import java.util.Date;

public class Admin {
    private Integer id;

    //账户名（登录用）
    private  String username;
    //用户名
    private  String name;
    //账户密码
    private  String pass;
    private String call;
    //role_id
    private  Integer role_id;
    //用户状态   0启用    1禁止
    private  Integer state;
    //创建时间
    private Date create_time;
    //删除时间
    private Date delete_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(Date delete_time) {
        this.delete_time = delete_time;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "AdminPo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", role_id=" + role_id +
                ", state=" + state +
                ", create_time=" + create_time +
                ", delete_time=" + delete_time +
                '}';
    }
}

