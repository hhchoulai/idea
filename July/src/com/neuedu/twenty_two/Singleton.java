package com.neuedu.twenty_two;

/**
 * 面试题 ：单例的应用
 */
public class Singleton {
    /**
     * 顺序问题  是先初始化还是先赋值
     */
//    先创建了构造函数，new了对象，给count1，count2初始化，此时count1=1；count2=1
    private static Singleton obj = new Singleton();
    //    然后又给count1  count2赋值  count1没赋值还是1；count2赋值为0
    public static int counter1;
    public static int counter2 =0;

//    private static Singleton obj=new Singleton();
    private Singleton() {
        counter1++;
        counter2++;
    }

    public static Singleton getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(counter1);
        System.out.println(counter2);
    }
}
