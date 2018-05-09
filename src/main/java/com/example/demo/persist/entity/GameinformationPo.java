package com.example.demo.persist.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 *详细游戏信息页面
 */
@Entity
@Table(name = "t_GameInformation")
public class GameinformationPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "game_name")
    private String name;

    //游戏商
    @Column(name = "game_Publisher")
    private String publisher;

    //游戏背景
    @Column(name = "game_background")
    private String background;

    //头标logo
    @Column(name = "game_logoUrl")
    private String logoUrl;

    //游戏主要所在种类
    @Column(name = "game_type")
    private String type;

    //游戏评分
    @Column(name = "game_score")
    private double score;

    //游戏宣传图片
    @Column(name = "game_image")
    private String imageUrl;

    @Column(name = "game_image2")
    private String imageUrl2;

    @Column(name = "game_image3")
    private String imageUrl3;
    //大小
    @Column(name = "game_size")
    private String size;

    // 版本
    @Column(name = "game_version")
    private String version;

    //更新时间
    @Column(name = "game_updateDate")
    private Timestamp updateDate;

    //发布时间
    @Column(name = "game_releaseDate")
    private Timestamp releaseDate;

    //游戏与游戏种类多对多的关系映射
    @Column(name = "type_id")
    private Integer type_id;


    //游戏与下载地址一对多的关系映射
    @Column(name = "GameDownload_id")
    private Integer GameDownload_id;

    //0待审核 1上线 2下线
    @Column(name = "STATUS")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    //游戏与下载地址一对多的关系映射
    @Column(name = "ADMIN_Id")
    private Integer adminId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getImageUrl3() {
        return imageUrl3;
    }

    public void setImageUrl3(String imageUrl3) {
        this.imageUrl3 = imageUrl3;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getGameDownload_id() {
        return GameDownload_id;
    }

    public void setGameDownload_id(Integer gameDownload_id) {
        GameDownload_id = gameDownload_id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "GameinformationPo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", background='" + background + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", type='" + type + '\'' +
                ", score=" + score +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageUrl2='" + imageUrl2 + '\'' +
                ", imageUrl3='" + imageUrl3 + '\'' +
                ", size='" + size + '\'' +
                ", version='" + version + '\'' +
                ", updateDate=" + updateDate +
                ", releaseDate=" + releaseDate +
                ", type_id=" + type_id +
                ", GameDownload_id=" + GameDownload_id +
                '}';
    }
}
