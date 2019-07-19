package com.neuedu.test;

import java.util.Scanner;

/**
 * 10进制转2进制
 */
public class TenTwo {
    public static void main(String[] args) {
        System.out.println("请输入一个十进制数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while (n>0) {
              s=n%2+s;//这种就是逆着写
//            s=s+n%2;//这种是顺着写
            n/=2;
        }
        System.out.print(s);
    }
}
