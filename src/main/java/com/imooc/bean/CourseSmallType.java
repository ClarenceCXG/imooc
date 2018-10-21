package com.imooc.bean;

public class CourseSmallType {
    private Integer cstId;

    private String cstType;

    private Integer cbtId;

    public void display(){
        System.out.println(cstId+" "+cstType+" "+cbtId);
    }

    public Integer getCstId() {
        return cstId;
    }

    public void setCstId(Integer cstId) {
        this.cstId = cstId;
    }

    public String getCstType() {
        return cstType;
    }

    public void setCstType(String cstType) {
        this.cstType = cstType == null ? null : cstType.trim();
    }

    public Integer getCbtId() {
        return cbtId;
    }

    public void setCbtId(Integer cbtId) {
        this.cbtId = cbtId;
    }
}