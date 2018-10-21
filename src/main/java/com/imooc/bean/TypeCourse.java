package com.imooc.bean;

public class TypeCourse {
    private Integer tcId;

    private Integer cstId;

    private Integer cid;

    public void display(){
        System.out.println(tcId+" "+cstId+" "+cid);
    }

    public Integer getTcId() {
        return tcId;
    }

    public void setTcId(Integer tcId) {
        this.tcId = tcId;
    }

    public Integer getCstId() {
        return cstId;
    }

    public void setCstId(Integer cstId) {
        this.cstId = cstId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}