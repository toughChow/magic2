package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 *游戏的分类
 */
@Entity
@Table(name = "t_gameTypes")
public class GametypePo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type_id;

    @Column(name = "type_name")
    private  String name;

    //游戏信息与游戏种类多对多的关系映射
    @Column(name = "Information_id")
    private  Integer Information_id;


    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInformation_id() {
        return Information_id;
    }

    public void setInformation_id(Integer information_id) {
        Information_id = information_id;
    }

    @Override
    public String toString() {
        return "GametypePo{" +
                "type_id=" + type_id +
                ", name='" + name + '\'' +
                ", Information_id=" + Information_id +
                '}';
    }
}

