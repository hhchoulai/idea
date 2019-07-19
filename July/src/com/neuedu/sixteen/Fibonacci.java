package com.neuedu.sixteen;

public class Fibonacci {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        int z=0;
        System.out.print(x+" ");
        System.out.print(y+" ");
        for (int i=2;i<16;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+" ");
        }
//        System.out.println(z);
    }
}
