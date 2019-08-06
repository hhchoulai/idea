package com.neuedu.twenty_four;

public class PuKe {
    public static void main(String[] args) {
        String[] f=new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] s=new String[]{"♥","♣","♦","♠"};
        Card c[]=new Card[52];
        int index=0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < s.length; j++) {
                Card card=new Card(f[i],s[j]);  //默认调用toString方法
                c[index++]=card;
            }
        }
        for (Card card : c) {
            System.out.println(card);
        }


    }
}
