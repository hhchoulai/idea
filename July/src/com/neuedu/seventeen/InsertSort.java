package com.neuedu.seventeen;

/**
 * 插入排序
 * 从第二个数开始，与第一个比较，小于它往前挪，大于它不动
 * 再看第三个数，小于第二个，交换，小于第一个再交换
 * 以此类推
 * 不好理解   动图：E:\图片
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a={234,21,3,13,2432,2,45};
        for (int i = 1; i < a.length; i++) {//因为认为第一个元素是已经排好序的
            for (int j = i; j >0; j--)
                if(a[j] < a[j-1]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
