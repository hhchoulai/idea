package com.neuedu.twenty_six;

import java.util.ArrayList;
import java.util.LinkedList;

/**	哪几盏灯泡是亮着的？
 一个房间里装有100盏白炽灯泡，每盏灯泡用一个拉线开关控制，并分别编号上1、2、3....100号。
 第一个  编号是1的倍数的灯泡开关拉一下，第二个学生进去将编号是2的倍数的灯泡开关拉一下.....
 第100个学生进去将编号是100的倍数的灯泡开关拉一下，
 若最初房间的所有灯都没亮，那么这100个学生拉开关结束后房间里有哪几盏灯泡是亮着的？
 *
 */
public class Lamp {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        LinkedList<String> b=new LinkedList<>();
        boolean[] bool=new boolean[100];
        for (boolean b1 : bool) {
            b1=false;
        }
        int count=0;
//        第一次进去都亮了 所以从2开始 并且置为true
//        j表示那100个灯最终的状态
        for (int i = 1; i <=100; i++) {
            for (int j=1;j<=100;j++){
                if (j%i==0){
                    if (bool[j-1]){
                        bool[j-1]=false;
                    }else {
                        bool[j-1]=true;
                    }
                }

            }
        }
        for (int i = 0; i < bool.length; i++) {
            if (bool[i]==true){
                count++;
                System.out.println("第"+(i+1)+"盏灯亮");
            }

        }
        System.out.println(count);
    }
}
