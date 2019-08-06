package com.neuedu.twenty_six;

import java.util.Scanner;

/**
 * 随意输入一个字符串(全部是字母)，1、去掉重复字母，2、每个字母出现了几次，3去掉重复字母后按照顺序排序。
 */
public class StringApp {


    public static void main(String[] args) {
        //    存放26个英文字母
        int[] a=new int[26];
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for (int i = 0; i <s.length() ; i++) {
//            s.codePointAt(i)是将字符串中第i个字符转为Unicode  a就是97  再减97  从0开始
//            这样就保证它已经有序了，0--a  1--b  2--c……
//            a[index]++就记录a[i]出现的次数
            a[s.codePointAt(i)-97]++;
        }
//        去重
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0){
                result=result+(char)(i+97);
                System.out.println((char)(i+97)+"出现了"+a[i]+"次");
            }
        }
        System.out.println(result);

    }
}
