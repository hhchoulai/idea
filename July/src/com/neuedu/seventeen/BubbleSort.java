package com.neuedu.seventeen;

import java.util.Arrays;

/**
 * 冒泡排序
 * 从小到大的排序
 * 任意俩个相邻的位置比较,先比好的是最大的，放到最后面
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a={12,3,55,3,2};
//      进行比较
        //第一次进行N-1次比较，以后依次递减1
        //按址传递
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int x : a) {
            System.out.print(x+" ");
        }
    }
}
