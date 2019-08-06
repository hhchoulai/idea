package com.neuedu.twenty_four;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ff");
        System.out.println(sb.toString());
        StringBuilderDemo s=new StringBuilderDemo();
        System.out.println(String.valueOf("12"));
        Integer x=1;//自动装箱
        int i=new Integer(1);//自动拆箱
        new Integer(1).intValue();

        Integer.valueOf(x);

    }
}
