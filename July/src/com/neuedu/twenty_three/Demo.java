package com.neuedu.twenty_three;

public class Demo {
    int x;
    public void a(){
        x=1;
        System.out.println(x);
    }
    public void b(){
        x=2;
        System.out.println(x);
    }
    public int c(){
        x=3;
        return x;
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.a();
        d.b();
        d.x=d.c();
        System.out.println(d.x);
    }
}
