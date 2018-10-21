package com.imooc.bean;

import java.util.Date;

public class Course {
    private Integer cid;

    private String cname;

    private Float cprice;

    private String cintroduce;

    private String cstatus;

    private String cpicture;

    private Date ctime;

    private String checkstatus;

    public void display(){
        System.out.println(cid+" "+cname+" "+cprice+" "+cintroduce+" "+cstatus+" "+cpicture+" "+ctime+" "+checkstatus);
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Float getCprice() {
        return cprice;
    }

    public void setCprice(Float cprice) {
        this.cprice = cprice;
    }

    public String getCintroduce() {
        return cintroduce;
    }

    public void setCintroduce(String cintroduce) {
        this.cintroduce = cintroduce == null ? null : cintroduce.trim();
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus == null ? null : cstatus.trim();
    }

    public String getCpicture() {
        return cpicture;
    }

    public void setCpicture(String cpicture) {
        this.cpicture = cpicture == null ? null : cpicture.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }
}