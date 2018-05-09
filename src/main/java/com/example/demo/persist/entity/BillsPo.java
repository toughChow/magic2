package com.example.demo.persist.entity;

import javax.persistence.*;
import java.sql.Date;

/*
 *账单
 */
@Entity
@Table(name = "t_bills")
public class BillsPo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer bills_id;

    //消费金额
    @Column(name = "bills_consumption")
    private long consumption;

    //消费时间
    @Column(name = "bills_date")
    private Date data;

    //消费项目
    @Column(name = "bills_name")
    private String name;

    //消费种类
    @Column(name = "bills_species")
    private String species;

    //用户与账单多对多
    @Column(name = "user_id")
    private Integer usersid;


    public Integer getBills_id() {
        return bills_id;
    }

    public void setBills_id(Integer bills_id) {
        this.bills_id = bills_id;
    }

    public long getConsumption() {
        return consumption;
    }

    public void setConsumption(long consumption) {
        this.consumption = consumption;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    @Override
    public String toString() {
        return "BillsPo{" +
                "bills_id=" + bills_id +
                ", consumption=" + consumption +
                ", data=" + data +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", user_id=" + usersid +
                '}';
    }
}

