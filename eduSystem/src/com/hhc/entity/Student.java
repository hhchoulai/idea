package com.hhc.entity;

public class Student {
    //szy:专业
    private String sno,sname,szy,sclass,scall;

    public Student() {
    }

    public Student(String sno, String sname, String szy, String sclass, String scall) {
        this.sno = sno;
        this.sname = sname;
        this.szy = szy;
        this.sclass = sclass;
        this.scall = scall;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSzy() {
        return szy;
    }

    public void setSzy(String szy) {
        this.szy = szy;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getScall() {
        return scall;
    }

    public void setScall(String scall) {
        this.scall = scall;
    }
}
