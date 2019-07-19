package com.neuedu.test;

public class Bank {
    public static void main(String[] args) {
        /*计算存款10000元，活期1年(0.35%)、活期2年，定期1年(1.5%)，定期2年(2.1%)后的本息合计*/
        int m=10000;
//        ho  ht:活期1年  活期2年
        int hy=(int)(m*(1+0.0035));
        int ht=(int)(m*(1+0.0035)*(1+0.0035));
//        done  dt:定期一年 定期二年
        int done=(int)(Math.round(m*(1+0.015)));
        int dt=(int)(Math.round(m*(1+0.021)+m*0.021));
        System.out.println(hy);
        System.out.println(ht);
        System.out.println(done);
        System.out.println(dt);

    }
}
