package com.neuedu.test;

/** 数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
 思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
 只要交换到arr.length/2的时候即可。
 *
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,44,4,5,6,7,22,9,10};
        for (int i = a.length-1; i>=0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
