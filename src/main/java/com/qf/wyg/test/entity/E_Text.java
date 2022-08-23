package com.qf.wyg.test.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Date;
public class E_Text implements Serializable {
    private Integer sid;
    private Date createtime;
    private String name;
    private Integer balance;

    public E_Text() {
    }

    public E_Text(Integer sid, Date createtime, String name, Integer balance) {
        this.sid = sid;
        this.createtime = createtime;
        this.name = name;
        this.balance = balance;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "E_Text{" +
                "sid=" + sid +
                ", createtime=" + createtime +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
