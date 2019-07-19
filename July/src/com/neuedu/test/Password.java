package com.neuedu.test;

import java.util.Scanner;

/**
 * .某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5,然后用这个数再除以10的余数代替该位的数字，再将第一位和第四位交换，第二位和第三位交换
 */
public class Password {
    public static void main(String[] args) {
        System.out.println("请输入一个四位正整数：");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a,b,c,d;
//        a,b，c,d分别表示表示千，百，十，个位
        a=x/1000;
        b=x%1000/100;
        c=x%100/10;
        d=x%10;
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        System.out.println(d*1000+c*100+b*10+a);


    }
}
