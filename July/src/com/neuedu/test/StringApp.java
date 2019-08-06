package com.neuedu.test;

/**
 * 随意输入一个字符串(全部是字母)，例如lkfjoforpqwprqwerweirureuiwreo,通过代码生成返回的结果有三个要求：
 * 1、去掉重复字母，2、每个字母出现了几次，3去掉重复字母后按照顺序排序。
 * 请你在不能使用任何数组原生方法，只能使用循环和赋值的情况下完成
 */
public class StringApp {
    //去重

    public static String removeRepeatChar(String str) {
        

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {

            char charWord = str.charAt(i);
//indexOf(charWord)是判断第一次出现charWord这个字符的索引
            int firstPosition = str.indexOf(charWord);
//indexOf(charWord)是判断最后一次出现charWord这个字符的索引
            int lastPosition = str.lastIndexOf(charWord);

            if (firstPosition == lastPosition || firstPosition == i) {
//firstPosition == lastPosition 代表某个字符在字符串中只出现了一次
//firstPosition == i  代表重复出现的字符只拼接一次
                sb.append(charWord);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeRepeatChar("ababkhj"));

    }
}
