package com.neuedu.test;

import java.util.Scanner;

/** 面试题（重要）
 * 1、去掉重复字母，2、每个字母出现了几次，3去掉重复字母后按照顺序排序。
 */
public class StrApp {
    public static void main(String args[]) {
//      数组记录a~z每个字母出现的次数  如果str[0]=0 代表a没出现过 str[1]=2就代表b出现了俩次
        int[] str = new int[26];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str1 = scanner.nextLine();
        String result = "";
//      遍历整个字符串
//        0--a  1--b 数组已经有序
        for (int i = 0; i < str1.length(); i++) {
//            将字符串转为Unicode码  a的Unicode是97  再减97正好是下标从0开始
            str[str1.codePointAt(i) - 97]++;
//          str[index]的值 是记录记录重复字母出现的次数
//          str[0]就代表a  str[1]就代表b……str[25]就代表z

        }
//      去重
        for (int i = 0; i < str.length; i++) {
//            str[i] != 0 代表str[i]出现过
            if (str[i] != 0) {
                result += (char) (i + 97);
            }
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i] != 0) {
                System.out.println((char) (i + 97) + "出现了" + str[i] + "次");
            }
        }
        System.out.println(result);

    }


}

