package com.imooc.bean;

import java.util.Date;

public class Order {
    private Integer oid;

    private Integer rid;

    private Integer cid;

    private String onumber;

    private Date otime;

    private String ostatus;

    public void display(){
        System.out.println(oid+" "+rid+" "+cid+" "+onumber+" "+otime+" "+ostatus);
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus == null ? null : ostatus.trim();
    }
}