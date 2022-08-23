package com.qf.wyg.platform.entity;

import java.io.Serializable;

public class E_Platform implements Serializable {
    private int pfid;
    private String pfno;
    private String pfname;
    private String pfaddress;
    private String pfcontacts;
    private String pftelForContacts;
    private String pfstatus;

    public E_Platform() {
    }

    public E_Platform(int pfid, String pfno, String pfname, String pfaddress, String pfcontacts, String pftelForContacts, String pfstatus) {
        this.pfid = pfid;
        this.pfno = pfno;
        this.pfname = pfname;
        this.pfaddress = pfaddress;
        this.pfcontacts = pfcontacts;
        this.pftelForContacts = pftelForContacts;
        this.pfstatus = pfstatus;
    }

    public int getPfid() {
        return pfid;
    }

    public void setPfid(int pfid) {
        this.pfid = pfid;
    }

    public String getPfno() {
        return pfno;
    }

    public void setPfno(String pfno) {
        this.pfno = pfno;
    }

    public String getPfname() {
        return pfname;
    }

    public void setPfname(String pfname) {
        this.pfname = pfname;
    }

    public String getPfaddress() {
        return pfaddress;
    }

    public void setPfaddress(String pfaddress) {
        this.pfaddress = pfaddress;
    }

    public String getPfcontacts() {
        return pfcontacts;
    }

    public void setPfcontacts(String pfcontacts) {
        this.pfcontacts = pfcontacts;
    }

    public String getPftelForContacts() {
        return pftelForContacts;
    }

    public void setPftelForContacts(String pftelForContacts) {
        this.pftelForContacts = pftelForContacts;
    }

    public String getPfstatus() {
        return pfstatus;
    }

    public void setPfstatus(String pfstatus) {
        this.pfstatus = pfstatus;
    }

    @Override
    public String toString() {
        return "E_Platform{" +
                "pfid=" + pfid +
                ", pfno='" + pfno + '\'' +
                ", pfname='" + pfname + '\'' +
                ", pfaddress='" + pfaddress + '\'' +
                ", pfcontacts='" + pfcontacts + '\'' +
                ", pftelForContacts='" + pftelForContacts + '\'' +
                ", pfstatus='" + pfstatus + '\'' +
                '}';
    }
}
