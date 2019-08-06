package com.neuedu.twenty_four;

public class StringDemo {
    boolean equals() {
        return super.equals(new StringDemo());
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "cd";
        String s3 = "ab" + "cd";
        String s4 = "abcd";
        String s5 =new String(s1);
        String s6 =new String(s2);
        String s7 = s5 + s6;
        String s8 = s1 + s6;
        System.out.println(s3 == s4);//true  在编译的时候做了优化，将 "ab（" + "）cd"中（）里的内容干掉了
        System.out.println(s1 == s5);//false  new了，不是一块地址
        System.out.println(s3 == s7);//false  以下  都是s7 = s5 + s6 等号后边是变量 得在运行期间确定它
        System.out.println(s3 == s8);//false  编译的时候没法做优化  所以是新字符串了  所以不相等
        System.out.println(s4 == s7);//false
        System.out.println(s4 == s8);//false

    }
}
