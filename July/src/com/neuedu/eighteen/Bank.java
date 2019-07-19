package com.neuedu.eighteen;

import java.util.Scanner;

/**
 * 银行管理系统
 * 1.查看余额
 * 2.存钱
 * 3.取钱
 * 4.转账
 * 5退出
 * 要求：每个功能封装成方法,系统循环使用
 */
public class Bank {
    static int money=10000;
    static Scanner sc=new Scanner(System.in);
    //入口
    public static void main(String[] args) {
        while (true){
            System.out.println("******************");
            System.out.println("1.查看余额");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入要查询的编号：");
            int num=sc.nextInt();

            sc.nextLine();//作用是清理（回收）空格

            switch (num){
                case 1:showMoney();
                    break;
                case 2:saveMoney();
                    break;
                case 3:withdrawMoney();
                    break;
                case 4:transferMoney(1000);
                    break;
                case 5:exit();
                    return;
                default:
                    System.out.println("没有此项");
            }
        }
    }
    //查看余额
    static void showMoney(){
        System.out.println("余额为："+money);
    }
    //存钱
    static void saveMoney(){
        System.out.println("请输入存款金额：");
        int x=sc.nextInt();
        money+=x;
        System.out.println("存款成功");
    }
    //取钱
    static void withdrawMoney(){
        System.out.println("请输入取款金额：");
        int x=sc.nextInt();
        if (x<=money){
            money-=x;
        }

        System.out.println("取款成功");
    }
    //转账
//    转账原理与取钱一样   为了不写重复代码   这里用有返回值的   固定每次转账是1000
    static int transferMoney(int x){
        money-=x;
        System.out.println("转账成功");
        return money;
    }
    //退出
    static void exit(){
        System.out.println("操作完成");
    }
}
