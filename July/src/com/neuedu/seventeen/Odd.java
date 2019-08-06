package com.neuedu.seventeen;

/**
 * 判断奇数偶数的另一种方法
 */

public class Odd {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //奇数偶数  (i&1)==1是奇数  =0是偶数
            //俩个数&的结果  相同是0，不同是1
            if((i&1)==0){
                System.out.println(i);
            }

        }

    }
}
