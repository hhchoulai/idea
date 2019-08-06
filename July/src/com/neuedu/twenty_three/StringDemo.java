package com.neuedu.twenty_three;

/**
 * 有如下方法定义：
 * public int find(String input ,String target);
 * 该方法的功能为查找input字符串中包含target字符串的个数。传入的参数变量值如下：
 * input="I like dogs,I have a dog.It's name is BigdogBoy";
 * target="dog";
 */
public class StringDemo {
    private static int count;

    public static int find(String input, String target) {
        //这块逻辑有问题
        /*for (int i = 0; i < input.length(); i++) {
            if (input.matches(target)) {//条件一直不成立 因为没截取  一直是一长串与一短串比较的
                count++;
            }
        }*/

        for (int i = 0; i <=input.length()-3; i++) {
            String s=input.substring(i,i+3);
            if (s.matches(target)) {//此时用matches也行，用equals也行
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "I like dogs,I have a dog.It's name is BigdogBoydog";
        String target = "dog";
        int x = find(input, target);
        System.out.println(x);

    }
}
