package com.neuedu.twenty_nine;


public class ExceptionTest {
    public static int a() {
        int a = 1;
        int b = 1;
        int c=0;
        try {
            c = a / b;
            return c;
        } catch (ArithmeticException e) {
            if (b==0){
                System.out.println("除数不能为0");
            }
        } finally {
            System.out.println("Aa");
//            return 123;
//            finally如果要有return  那么它就不再会到try块执行了
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(a());
    }
}

