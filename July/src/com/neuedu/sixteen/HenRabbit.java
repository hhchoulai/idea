package com.neuedu.sixteen;

import java.util.Scanner;

public class HenRabbit {
    public static void main(String[] args) {
        System.out.println("请输入头的数量：");
        Scanner sc=new Scanner(System.in);
        int head=sc.nextInt();
        System.out.println("请输入脚的数量：");
        int foot=sc.nextInt();
//        hnum,rnum分别代表鸡和兔的数量
        int rnum=(foot-2*head)/2;
        int  hnum=head-rnum;
//        if((foot%2!=0)&&(hnum<0)||(rnum<0)){
//            System.out.println("输入有误，请重新输入。");
//        }else {
//            System.out.println(hnum+"鸡"+rnum+"兔");
//        }
        if (hnum>=0 && rnum>=0 && (foot%2==0) && 2*head<=foot&&foot<=4*head){
                System.out.println(hnum+"鸡"+rnum+"兔");
        }else {
            System.out.println("输入有误，请重新输入。");
        }
    }
}
