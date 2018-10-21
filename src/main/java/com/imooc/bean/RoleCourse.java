package com.imooc.bean;

public class RoleCourse {
    private Integer rcId;

    private Integer rid;

    private Integer cid;

    private Integer ucStatus;

    public void display(){
        System.out.println(rcId+" "+rid+" "+cid+" "+ucStatus);
    }

    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
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

    public Integer getUcStatus() {
        return ucStatus;
    }

    public void setUcStatus(Integer ucStatus) {
        this.ucStatus = ucStatus;
    }
}