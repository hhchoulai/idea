package com.neuedu.seventeen;

/**
 * 二分查找
 */
public class Sort {
    public static void main(String[] args) {
        //要找1
        int[] a=new int[]{2,4,5,6,7,8,9};
        //定义左右是为了方便找中间那个数的下标
        int left=0;
        int right=a.length;
        int middle= 0;
        for (int i = 0; i < a.length; i++) {
            //如果定义在全局，middle不会变，而定义在循环体中，middle是动态改变的
            middle = (left+right)/2;
            if (9==a[middle]){
                System.out.println(a[middle]);
                break;
            }else if(9>a[middle]){
                left=middle;
            }else {
                right=middle;
            }
        }
    }
}
