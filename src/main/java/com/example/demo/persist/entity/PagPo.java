package com.example.demo.persist.entity;

import javax.persistence.*;

/*
 *账户余额表
 */
@Entity
@Table(name = "t_pag")
public class PagPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer  pag_id;

    //余额
    @Column(name = "pag_balance")
    private  long Balance;

    //与银行卡双向一对多/多对一
    @Column(name = "user_id")
    private Integer userId;

    public Integer getPag_id() {
        return pag_id;
    }

    public void setPag_id(Integer pag_id) {
        this.pag_id = pag_id;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance) {
        Balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PagPo{" +
                "pag_id=" + pag_id +
                ", Balance=" + Balance +
                ", bank_id=" + userId +
                '}';
    }
}

