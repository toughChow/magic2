package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 * 下载地址
 */
@Entity
@Table(name = "t_download")
public class GameDownloadPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer download_id;

    @Column(name = "download_ios")
    private String ios;

    @Column(name = "download_Android")
    private String Android;

    //与游戏信息类的多对一关系
    @Column(name = "Information_id")
    private Integer Information_id;

    public Integer getDownload_id() {
        return download_id;
    }

    public void setDownload_id(Integer download_id) {
        this.download_id = download_id;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getAndroid() {
        return Android;
    }

    public void setAndroid(String android) {
        Android = android;
    }

    public Integer getInformation_id() {
        return Information_id;
    }

    public void setInformation_id(Integer information_id) {
        Information_id = information_id;
    }

    @Override
    public String toString() {
        return "GameDownloadPo{" +
                "download_id=" + download_id +
                ", ios='" + ios + '\'' +
                ", Android='" + Android + '\'' +
                ", Information_id=" + Information_id +
                '}';
    }
}

