package com.hhc.entity;

public class Course {
    private String cno,cname,ccredit,cteacher;
    public Course(){

    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCcredit(String ccredit) {
        this.ccredit = ccredit;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getCno() {
        return cno;
    }

    public String getCname() {
        return cname;
    }

    public String getCcredit() {
        return ccredit;
    }

    public String getCteacher() {
        return cteacher;
    }

    public Course(String cno, String cname, String ccredit, String cteacher) {
        this.cno = cno;
        this.cname = cname;
        this.ccredit = ccredit;
        this.cteacher = cteacher;
    }

}