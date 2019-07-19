package com.neuedu.eighteen;

/**
 * 址传递    改变他的元素，他也跟着改了
 */
public class ValueAddress {
    public static void main(String[] args) {
        int[] a={1,23,3};
        int[] b=a;
        for (int i : a) {
            System.out.print(i+" ");
            System.out.println();
        }
        b[0]=10;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]+" ");
        }

    }
}
