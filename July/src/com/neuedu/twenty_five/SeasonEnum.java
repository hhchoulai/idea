package com.neuedu.twenty_five;

public enum SeasonEnum {
    //四个常量  就相当于new的static final对象  只不过这是语法糖 可以简写成这样
    //注意  这里用，分割   只在最后一个常量后写；
    SPRING("春天",1),
    SUMMER("夏天",2),
    AUTUMN("秋天",3),
    WINNER("冬天",4);

    private String name;
    private int num;

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    SeasonEnum(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
