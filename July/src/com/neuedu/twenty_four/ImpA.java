package com.neuedu.twenty_four;

public class ImpA implements A{
    public int a(int x){
        System.out.println(x);
        return x;
    }

    @Override
    public void b() {
        System.out.println("bbbb");
    }

    public static void main(String[] args) {
        new ImpA().b();
    }
}
