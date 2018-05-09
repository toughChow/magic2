package com.example.demo.persist.entity;

import javax.persistence.*;

/**
 * 商家信息
 */
@Entity
@Table(name = "t_VendorInformation")
public class VendorInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //评分
    @Column(name = "number")
    private  String number;
    //粉丝数
    @Column(name = "fans")
    private  String fans;

    //公司介绍
    @Column(name = "introduce")
    private  String introduce;
    //公司标语
    @Column(name = "slogan")
    private  String slogan;

    //公司logo
    @Column(name = "logo",columnDefinition = "0")
    private  String logo;

    //公司电话
    @Column(name = "tell")
    private  String tell;

    //商家ID
    @Column(name = "admin_id")
    private  Integer adminId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    @Override
    public String toString() {
        return "VendorInformation{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", fans='" + fans + '\'' +
                ", introduce='" + introduce + '\'' +
                ", slogan='" + slogan + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
