package com.neuedu.test;

import com.neuedu.sixteen.A;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Math.sqrt(4);//求根号4，返回的结果是double型
        Math.random();//生成0~1之间的随机数
        Math.max(2,3);//求俩个类型相同的数的最大值
        Math.min(3,4);//求俩个类型相同的数的最小值
        Math.abs(-9);//求一个数的绝对值
        Math.round(4.5);//四舍五入
        Math.floor(4.4);//向下取整
        Math.ceil(3.7);//向上取整
        Math.pow(2,3);//2的3次方
        int[] a={1,2,3,4,5,6,7};
        Arrays.sort(a);//排序
        int[] b=Arrays.copyOf(a,9);//复制数组
        Arrays.toString(a);//取元素
        Arrays.equals(a,b);//比较俩个数组是否一致


    }
}