package com.neuedu.sixteen;

/**
 * a~z正着输一遍再反着输一遍（z只出现一次）
 */
public class Ascii {
    public static void main(String[] args) {
        for (int i = 97; i < 123 ;i++) {
            System.out.print((char)i);
        }
        for (int i=121;i>=97;i--){
            System.out.print((char)i);
        }
    }
}