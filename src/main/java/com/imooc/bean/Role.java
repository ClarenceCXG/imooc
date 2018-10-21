package com.imooc.bean;

public class Role {
    private Integer rid;

    private String rname;

    private String rphone;

    private String rpassword;

    private String rmail;

    private String rintroduce;

    private String rpicture;

    private Integer rpoint;

    private Integer rtype;

    public void display(){
        System.out.println(rid+" "+rname+" "+rphone+" "+rpassword+" "+rmail+" "+rintroduce+" "+rpicture+" "+rpoint+" "+rtype);
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRphone() {
        return rphone;
    }

    public void setRphone(String rphone) {
        this.rphone = rphone == null ? null : rphone.trim();
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword == null ? null : rpassword.trim();
    }

    public String getRmail() {
        return rmail;
    }

    public void setRmail(String rmail) {
        this.rmail = rmail == null ? null : rmail.trim();
    }

    public String getRintroduce() {
        return rintroduce;
    }

    public void setRintroduce(String rintroduce) {
        this.rintroduce = rintroduce == null ? null : rintroduce.trim();
    }

    public String getRpicture() {
        return rpicture;
    }

    public void setRpicture(String rpicture) {
        this.rpicture = rpicture == null ? null : rpicture.trim();
    }

    public Integer getRpoint() {
        return rpoint;
    }

    public void setRpoint(Integer rpoint) {
        this.rpoint = rpoint;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }
}