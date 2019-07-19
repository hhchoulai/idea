package com.neuedu.seventeen;

import java.util.Scanner;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a=new int[]{2,4,5,6,7,8,9};
        int left=0;//代表左边那个数的数组下标
        int right=a.length-1;
        System.out.println("请输入要查找的数");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while (true){
            int middle=(left+right)/2;//中间数的下标
            if (x==a[middle]){
                System.out.println("找到了");
                break;
            }else if(x>a[middle]){
                left=middle+1;
            }else {
                right=middle-1;
            }

            if (a[right]!=x&&a[left]!=x){
                System.out.println("没有这个数");
                break;
            }
        }
    }
}
