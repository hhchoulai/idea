package com.neuedu.test;

/**
 * 递归
 * 编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 */
public class Recuision {
    static int digui(int x){
            if (x > 2) {
                return digui(x - 1) + digui(x - 2);
            } else if(x<=0){
                return -1;
            }else{
                return 1;
        }
    }
    public static void main(String[] args) {
//        另一种方法
        /*int a=1;
        int b=1;
        int f=0;
        for (int i = 2; i < 40; i++) {
            f=a+b;
            a=b;
            b=f;
        }
        System.out.println(f);*/
        System.out.println(digui(40));
    }
}
