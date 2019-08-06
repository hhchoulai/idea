package com.neuedu.twenty_six;

/**
 * 回调函数的测试类   相关类 CallBack  IOMock
 */
public class Test {
    public static void main(String[] args) {
        CallBack callBack=new CallBack();
        new IOMock().readFile("QWE",callBack);
    }
}
