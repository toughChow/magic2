package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 *权限
 */
@Entity
@Table(name = "t_Module")
public class ModulePo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer module_id;

    @Column(name = "role_name")
    private  String name;

    //角色多对多
    @Column(name = "role_id")
    private  Integer role_id;

    public Integer getModule_id() {
        return module_id;
    }

    public void setModule_id(Integer module_id) {
        this.module_id = module_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "ModulePo{" +
                "module_id=" + module_id +
                ", name='" + name + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}

