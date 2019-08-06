package com.neuedu.twenty_five;

/**
 * 懒汉式 单例模式
 */
public class Single {
    int x;
    String name;
    public Single(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Single{" +
                "x=" + x +
                ", name='" + name + '\'' +
                '}';
    }

    //私有静态对象
    private static Single s;
    //提供一个方法getInstance  来使单例传参  而不是死的  用静态方法替代构造方法
    public static Single getInstance(int x){
        if (s==null){
            return new Single(x);
        }
        return s;
    }
}
