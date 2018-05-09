package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 *下载墙纸类
 */
@Entity
@Table(name = "t_wall")
public class WallPaperPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wall_id")
    private Integer id;

    //普通图片
    @Column(name = "wall_ordinary")
    private  String ordinary;

    //高清图片
    @Column(name = "wall_HD")
    private  String hd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdinary() {
        return ordinary;
    }

    public void setOrdinary(String ordinary) {
        this.ordinary = ordinary;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "WallPaperPo{" +
                "id=" + id +
                ", ordinary='" + ordinary + '\'' +
                ", hd='" + hd + '\'' +
                '}';
    }
}
