package com.neuedu.seventeen;

/**
 * 选择排序
 * 第一个与之后的所有的比，小的往前
 * 拍好后，第二给与之后的比，小的往前
 * 以此类推
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a={12,4,2,5,7,21,1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
