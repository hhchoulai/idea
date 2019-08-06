package com.neuedu.twenty_four;

public class ExtTest extends Test{
    @Override
    public void a(int x) {
        System.out.println("chongxei");

    }

    public static void main(String[] args) {
        ExtTest e=new ExtTest();
        e.a(2);
    }
}
