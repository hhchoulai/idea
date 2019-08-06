package com.neuedu.test;

/**
 * 在1-1000内找到满足如下两个条件的数字
 * 条件1：在斐波那契序列中出现（1,2,3,5,8,13……）条件2：是质数（只能被1和他本身整除的数字被称为质数）
 */
public class FibonacciPrime {
    //判断这数是否是Fibonacci数
    public static boolean isFbnc(int a) {
        int x = 1;
        int y = 1;
        int z = 0;
        for (int i = 2; i < 16; i++) {
            z = x + y;
            x = y;
            y = z;
            if (a == z || a == 1) {
                return true;
            }
        }
        return false;
    }

    //判断这数是否为质数
    public static boolean isPrime(int a) {
        for (int i=2;i<=a/2;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
//主方法
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isFbnc(i)&&isPrime(i)){
                System.out.println(i);
            }
        }
    }
}

