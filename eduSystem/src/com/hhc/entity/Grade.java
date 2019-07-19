package com.hhc.entity;

public class Grade {
    private String sno,sname;
    private int gjava,gshuju,gcaozuo,gzucheng,gsuanfa,gEnglish,gOracle,ggailv;
    //无参构造
    public Grade() {
    }
    //get  set 方法
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

    public int getGjava() {
        return gjava;
    }

    public void setGjava(int gjava) {
        this.gjava = gjava;
    }

    public int getGshuju() {
        return gshuju;
    }

    public void setGshuju(int gshuju) {
        this.gshuju = gshuju;
    }

    public int getGcaozuo() {
        return gcaozuo;
    }

    public void setGcaozuo(int gcaozuo) {
        this.gcaozuo = gcaozuo;
    }

    public int getGzucheng() {
        return gzucheng;
    }

    public void setGzucheng(int gzucheng) {
        this.gzucheng = gzucheng;
    }

    public int getGsuanfa() {
        return gsuanfa;
    }

    public void setGsuanfa(int gsuanfa) {
        this.gsuanfa = gsuanfa;
    }

    public int getgEnglish() {
        return gEnglish;
    }

    public void setgEnglish(int gEnglish) {
        this.gEnglish = gEnglish;
    }

    public int getgOracle() {
        return gOracle;
    }

    public void setgOracle(int gOracle) {
        this.gOracle = gOracle;
    }

    public int getGgailv() {
        return ggailv;
    }

    public void setGgailv(int ggailv) {
        this.ggailv = ggailv;
    }
    //有参构造
    public Grade(String sno, String sname, int gjava, int gshuju, int gcaozuo, int gzucheng, int gsuanfa, int gEnglish, int gOracle, int ggailv) {
        this.sno = sno;
        this.sname = sname;
        this.gjava = gjava;
        this.gshuju = gshuju;
        this.gcaozuo = gcaozuo;
        this.gzucheng = gzucheng;
        this.gsuanfa = gsuanfa;
        this.gEnglish = gEnglish;
        this.gOracle = gOracle;
        this.ggailv = ggailv;
    }
}
