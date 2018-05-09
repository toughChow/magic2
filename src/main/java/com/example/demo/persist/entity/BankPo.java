package com.example.demo.persist.entity;

import javax.persistence.*;
import java.util.Date;

/*
 *银行卡列表
 */
@Entity
@Table(name = "t_bank")
public class BankPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bank_id;

    //卡号
    @Column(name = "bank_number",length = 21)
    private  long number;

    //用户与银行卡多对多
    @Column(name = "start_date")
    private Date startDate;

    //用户与银行卡多对多
    @Column(name = "user_id")
    private  Integer userid;

    //与账户余额单向多对一
    @Column(name = "pag_id")
    private  Integer pag_id;

    public Integer getBank_id() {
        return bank_id;
    }

    public void setBank_id(Integer bank_id) {
        this.bank_id = bank_id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPag_id() {
        return pag_id;
    }

    public void setPag_id(Integer pag_id) {
        this.pag_id = pag_id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "BankPo{" +
                "bank_id=" + bank_id +
                ", number=" + number +
                ", user_id=" + userid +
                ", pag_id=" + pag_id +
                '}';
    }
}
