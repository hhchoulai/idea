package com.neuedu.test;
import java.util.Scanner;
/**
 * 打牌里面经常出现5张牌一个顺子带一对,符号返回true  不符合返回false
 */
public class DouDiZhu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入5个数：");
        int x=0;
        int[] a=new int[5];
//      将输入的5个数放到数组里
        for (int i = 0; i < a.length; i++) {
            x=scanner.nextInt();
            a[i]=x;
        }
//        创建一个数组用于计算1-13出现的次数 1-13分别代表A-K
        int[] b=new int[13];
        boolean flag=false;
        int count1 = 0;
        int count2 = 0;
//        第一层循环遍历的是数组 第二层循环是1-13 每个数字的计数
        for (int i=0;i<a.length;i++){
            for (int j = 0; j < b.length; j++) {
                if (a[i]==j+1){
                    b[j]++;
//                    b[j]代表j+1出现的次数
                    break; //break是跳出for循环
                }
            }
        }
//      当数组中出现俩个一样计数一 3个一样 计数一
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 2){
                count1++;
            }
            if (b[i] == 3) {
                count2++;
            }
        }
//        当俩个计数同时都是一  才满足“三带一对”的条件
        if (count1 == 1 && count2 == 1){
            flag = true;
        }

        System.out.println(flag);

    }

}
