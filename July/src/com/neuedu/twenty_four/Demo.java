package com.neuedu.twenty_four;

public class Demo {

    /*//    饿汉式 单例模式
    private static final Demo d=new Demo();
    //私有构造  不能new对象
    private Demo(){}
    public static Demo getInstance(){
        return d;
    }*/

/*//    懒汉式 单例模式
//    volatile保证每次读数据都是从内存中读且静止指令重排   关联到很多知识  详细的请搜volatile关键字
//    https://www.cnblogs.com/zhengbin/p/5654805.html#autoid-0-1-0
    private static volatile Demo demo;
    private Demo(){}
//    synchronized同步锁  有关线程的东西  现在也不懂  等以后再品吧GG
//    其实是用getInstance这个静态方法来代替构造方法
    public static synchronized Demo getInstance(){
        if(demo==null){
            demo=new Demo();
        }
        return demo;
    }*/

/*//静态内部类
    private static class Holder{
        private static final Demo d=new Demo();
}
    private Demo(){}
    public static Demo getInstance(){
        return Holder.d;
    }
    public static void main(String[] args) {
        Demo.getInstance();
    }*/


}
