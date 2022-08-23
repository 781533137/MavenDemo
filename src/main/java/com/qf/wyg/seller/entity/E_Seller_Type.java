package com.qf.wyg.seller.entity;

import java.io.Serializable;

public class E_Seller_Type implements Serializable {
    private int stid;
    private int stno;
    private String stname;
    private char ststatus;

    public E_Seller_Type() {
    }

    public E_Seller_Type(int stid, int stno, String stname, char ststatus) {
        this.stid = stid;
        this.stno = stno;
        this.stname = stname;
        this.ststatus = ststatus;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getStno() {
        return stno;
    }

    public void setStno(int stno) {
        this.stno = stno;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public char getStstatus() {
        return ststatus;
    }

    public void setStstatus(char ststatus) {
        this.ststatus = ststatus;
    }

    @Override
    public String toString() {
        return "E_Seller_Type{" +
                "stid=" + stid +
                ", stno=" + stno +
                ", stname='" + stname + '\'' +
                ", ststatus=" + ststatus +
                '}';
    }
}
