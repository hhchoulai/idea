package com.neuedu.twenty_five;

/**
 * 线程安全的单例模式
 */
public class Singleton {
    //静态内部类
//    不会在单例加载时就加载，而是在调用getInstance的时候加载
    private static class singletonHolder{
        private static Singleton singleton=new Singleton();
    }
    private Singleton(){

    }
    public static Singleton getInstance(){
        return singletonHolder.singleton;
    }

}
