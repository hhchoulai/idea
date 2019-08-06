package com.neuedu.twenty_six;

public class IOMock {
//    模拟读取文件
    public void readFile(String path,CallBack callBack){
//    回调：    callBack对象作为参数传进来了  又通过调用对象的方法，将readFile这个方法里的content传出去了
        String  content="读取的内容";
        callBack.call(content);
    }
}
