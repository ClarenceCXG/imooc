package com.imooc.bean;

public class CourseVideo {
    private Integer cvId;

    private Integer cid;

    private Integer cvSortid;

    private String cvName;

    private String cvPath;

    public void display(){
        System.out.println(cvId+" "+cid+" "+cvSortid+" "+cvName+" "+cvPath);
    }

    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCvSortid() {
        return cvSortid;
    }

    public void setCvSortid(Integer cvSortid) {
        this.cvSortid = cvSortid;
    }

    public String getCvName() {
        return cvName;
    }

    public void setCvName(String cvName) {
        this.cvName = cvName == null ? null : cvName.trim();
    }

    public String getCvPath() {
        return cvPath;
    }

    public void setCvPath(String cvPath) {
        this.cvPath = cvPath == null ? null : cvPath.trim();
    }
}