package com.imooc.bean;

public class CourseBigType {
    private Integer cbtId;

    private String cbtType;

    public void display(){
        System.out.println(cbtId+" "+cbtType);
    }

    public Integer getCbtId() {
        return cbtId;
    }

    public void setCbtId(Integer cbtId) {
        this.cbtId = cbtId;
    }

    public String getCbtType() {
        return cbtType;
    }

    public void setCbtType(String cbtType) {
        this.cbtType = cbtType == null ? null : cbtType.trim();
    }
}