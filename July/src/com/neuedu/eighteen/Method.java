package com.neuedu.eighteen;

import java.util.Arrays;

/**
 *
 * 封装的俩个方法   用的是冒泡排序的例子
 * 比较值传递与引用传递
 */
public class Method {
    public static void main(String[] args) {
        int[] a={12,3,55,3,2,6};
        //值
//        int[] c=Value(a);
//        for (int i : c) {
//            System.out.println(i);
//        }
        Address(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
    //按值传递   需要返回值，把修改了的数组返回回来
//   思想：     创建新数组
  /*  static int[] Value(int[] arr){
        // 从原来的数组拷贝过来
        int[] b= Arrays.copyOf(arr,arr.length);
        //循环多少次
        for (int i = 0; i < b.length-1; i++)
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        return b;
    }*/
    //按址传递
    //思想：在改变原来的数组
    static void Address(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}

