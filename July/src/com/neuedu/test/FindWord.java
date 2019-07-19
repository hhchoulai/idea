package com.neuedu.test;

import java.util.Scanner;

/**
 *  数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 *  然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，
 *  包含这个单词就打印出“Yes”，不包含就打印出“No”。
 */
public class FindWord {

    public static void main(String[] args) {
        String [] a=new String[]{"h","a","p","u","q","w","e","r","t","y"};
        System.out.println("请输入一个单词");
        Scanner sc=new Scanner(System.in);
        String  x=sc.nextLine();
//这块逻辑可以优化
        for (int i=0;i<a.length;i++){
            if (a[i].matches(x)){
                System.out.println("Yes");
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            if (!a[i].matches(x)){
                System.out.println("No");
                break;
            }
        }
//
    }
}
