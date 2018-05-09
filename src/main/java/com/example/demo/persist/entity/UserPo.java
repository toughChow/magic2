package com.example.demo.persist.entity;

import javax.persistence.*;
import java.util.Date;

/*
 *用户表
 */
@Entity
@Table(name = "t_user")
public class UserPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(name = "user_name")//账号
    private  String name;

    @Column(name = "user_Idname")//用户名
    private String Idname;

    @Column(name = "user_pass")
    private  String user_pass;

    @Column(name = "user_age")
    private  int age;

    @Column(name = "user_sex")
    private  int sex;//1男 0 女

    @Column(name = "user_email")
    private  String email;

    //创建时间
    @Column(name = "user_create_date")
    private Date create_date;
    //创建时间
    @Column(name = "user_url")
    private String imageurl;

    //状态
    @Column(name = "user_status",columnDefinition = "varchar(128) default '0'")//0为激活用户，1为封号中
    private int status;//0启用 1是 禁止


    //与余额单向一对一
    @Column(name = "pagPo_id")
    private Integer pagPo_id;

    //用户与角色多对多
    @Column(name = "role_id")
    private Integer role_id;

    //用户与账单多对多
    @Column(name = "bill_id")
    private Integer bill_id;

    //用户与银行卡多对多
    @Column(name = "bank_id")
    private Integer bank_id;

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

    public String getIdname() {
        return Idname;
    }

    public void setIdname(String idname) {
        Idname = idname;
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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getPagPo_id() {
        return pagPo_id;
    }

    public void setPagPo_id(Integer pagPo_id) {
        this.pagPo_id = pagPo_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public Integer getBank_id() {
        return bank_id;
    }

    public void setBank_id(Integer bank_id) {
        this.bank_id = bank_id;
    }

    @Override
    public String toString() {
        return "UserPo{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", Idname='" + Idname + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", create_date=" + create_date +
                ", imageurl='" + imageurl + '\'' +
                ", status=" + status +
                ", pagPo_id=" + pagPo_id +
                ", role_id=" + role_id +
                ", bill_id=" + bill_id +
                ", bank_id=" + bank_id +
                '}';
    }
}

