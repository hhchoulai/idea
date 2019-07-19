package com.neuedu.seventeen;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        //定义数组
        int[] a=new int[5];
        //数组初始化
        for (int i = 0; i < 5; i++) {
            Random r=new Random();
            a[i]=r.nextInt(10);
        }
        //遍历数组
        for (int x:a) {
            System.out.print(x+"  ");
        }
        System.out.println();
        //求最大值,最小值
        int max=a[0];
        int min=a[0];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            sum+=a[i];
        }
        System.out.println("最大值"+max+" 最小值 "+min);
        System.out.println("总和"+sum);
        System.out.println("平均值"+sum*1.0/a.length);
    }
}
