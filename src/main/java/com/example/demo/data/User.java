package com.example.demo.data;

import java.util.Date;
import java.util.Set;

public class User {
    private Integer user_id;

    private  String name;

    private  String user_pass;

    private  int age;

    private  int sex;

    //用户名
    private String Idname;

    private  String email;
    //角色表
    private Integer role_id;

    //创建时间
    private Date create_date;

    //状态
    private int status;

    private String imageurl;

    //与余额单向一对一
    private Integer PagPo_id;

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdname() {
        return Idname;
    }

    public void setIdname(String idname) {
        Idname = idname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getPagPo_id() {
        return PagPo_id;
    }

    public void setPagPo_id(Integer pagPo_id) {
        PagPo_id = pagPo_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", Idname='" + Idname + '\'' +
                ", email='" + email + '\'' +
                ", role_id=" + role_id +
                ", create_date=" + create_date +
                ", status=" + status +
                ", imageurl='" + imageurl + '\'' +
                ", PagPo_id=" + PagPo_id +
                '}';
    }
}

