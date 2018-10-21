package com.imooc.bean;

import java.util.Date;

public class CourseComment {
    private Integer ccId;

    private Integer cid;

    private Integer rid;

    private String ccComment;

    private Date ccTime;

    public void display(){
        System.out.println(ccId+" "+cid+" "+cid+" "+rid+" "+ccComment+" "+ccTime);
    }

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getCcComment() {
        return ccComment;
    }

    public void setCcComment(String ccComment) {
        this.ccComment = ccComment == null ? null : ccComment.trim();
    }

    public Date getCcTime() {
        return ccTime;
    }

    public void setCcTime(Date ccTime) {
        this.ccTime = ccTime;
    }
}