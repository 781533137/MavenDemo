package com.qf.wyg.seller.entity;

import java.io.Serializable;

public class E_Seller implements Serializable {
    private int tid;
    private String tname;
    private int stno;
    private String temail;
    private String tmobile;
    private String taccount;
    private String taddress;
    private String tcontacts;
    private String ttel;
    private String tpassword;
    private char tstatus;
    private String tsellerno;
    E_Seller_Type seller_type; // 商户与商户类型关联
    public E_Seller() {
    }

    public E_Seller(int tid, String tname, int stno, String temail, String tmobile, String taccount, String taddress, String tcontacts, String ttel, String tpassword, char tstatus, String tsellerno) {
        this.tid = tid;
        this.tname = tname;
        this.stno = stno;
        this.temail = temail;
        this.tmobile = tmobile;
        this.taccount = taccount;
        this.taddress = taddress;
        this.tcontacts = tcontacts;
        this.ttel = ttel;
        this.tpassword = tpassword;
        this.tstatus = tstatus;
        this.tsellerno = tsellerno;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getStno() {
        return stno;
    }

    public void setStno(int stno) {
        this.stno = stno;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTmobile() {
        return tmobile;
    }

    public void setTmobile(String tmobile) {
        this.tmobile = tmobile;
    }

    public String getTaccount() {
        return taccount;
    }

    public void setTaccount(String taccount) {
        this.taccount = taccount;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public String getTcontacts() {
        return tcontacts;
    }

    public void setTcontacts(String tcontacts) {
        this.tcontacts = tcontacts;
    }

    public String getTtel() {
        return ttel;
    }

    public void setTtel(String ttel) {
        this.ttel = ttel;
    }

    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    public char getTstatus() {
        return tstatus;
    }

    public void setTstatus(char tstatus) {
        this.tstatus = tstatus;
    }

    public String getTsellerno() {
        return tsellerno;
    }

    public void setTsellerno(String tsellerno) {
        this.tsellerno = tsellerno;
    }

    public E_Seller_Type getSeller_type() {
        return seller_type;
    }

    public void setSeller_type(E_Seller_Type seller_type) {
        this.seller_type = seller_type;
    }

    @Override
    public String toString() {
        return "E_Seller{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", stno=" + stno +
                ", temail='" + temail + '\'' +
                ", tmobile='" + tmobile + '\'' +
                ", taccount='" + taccount + '\'' +
                ", taddress='" + taddress + '\'' +
                ", tcontacts='" + tcontacts + '\'' +
                ", ttel='" + ttel + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tstatus=" + tstatus +
                ", tsellerno='" + tsellerno + '\'' +
                ", seller_type=" + seller_type +
                '}';
    }
}
