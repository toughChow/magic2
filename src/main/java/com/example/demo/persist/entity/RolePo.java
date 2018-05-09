package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 *角色表
 */
@Entity
@Table(name = "t_role")
public class RolePo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_name")
    private  String name;

    //用户与角色多对多
    @Column(name = "user_id")
    private  Integer user_id;

    //角色与权限
    @Column(name = "module_id")
    private  Integer module_id;

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


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getModule_id() {
        return module_id;
    }

    public void setModule_id(Integer module_id) {
        this.module_id = module_id;
    }

    @Override
    public String toString() {
        return "RolePo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_id=" + user_id +
                ", module_id=" + module_id +
                '}';
    }
}

