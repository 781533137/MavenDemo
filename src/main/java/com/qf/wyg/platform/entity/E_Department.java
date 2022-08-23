package com.qf.wyg.platform.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class E_Department implements Serializable {
    private int did;
    private String dno;
    private String dname;
    private String pno;
    private char dstatus;
    private List<Map<String, Object>>depList;

    public E_Department(int did, String dno, String dname, String pno, char dstatus) {
        this.did = did;
        this.dno = dno;
        this.dname = dname;
        this.pno = pno;
        this.dstatus = dstatus;
    }

    public E_Department() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public char getDstatus() {
        return dstatus;
    }

    public void setDstatus(char dstatus) {
        this.dstatus = dstatus;
    }

    public List<Map<String, Object>> getDepList() {
        return depList;
    }

    public void setDepList(List<Map<String, Object>> depList) {
        this.depList = depList;
    }

    @Override
    public String toString() {
        return "E_Department{" +
                "did=" + did +
                ", dno='" + dno + '\'' +
                ", dname='" + dname + '\'' +
                ", pno='" + pno + '\'' +
                ", dstatus=" + dstatus +
                '}';
    }
}
