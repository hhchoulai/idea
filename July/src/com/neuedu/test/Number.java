package com.neuedu.test;

/**
 * 获取数组最大值和最小值操作：
 * 利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
 * 并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
 */
public class Number {
    static int getRandom(int n) {
        int   r = (int) (Math.random() * n);//0~n之间的随机数
        return r;
    }

    public static void main(String[] args) {
        int [] a=new int[50];
//        初始化
        for (int i = 0; i < a.length; i++) {
            a[i]=getRandom(100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int max=a[0],min=a[0],count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>=60){
                count++;
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println(">=60的个数："+count);
    }
}
