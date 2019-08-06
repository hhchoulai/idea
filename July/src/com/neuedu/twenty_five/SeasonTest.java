package com.neuedu.twenty_five;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.SPRING);
        SeasonEnum[] ss=SeasonEnum.values();
        for (SeasonEnum s : ss) {
            System.out.println(s.getName());
            System.out.println(s.getNum());
        }
    }
}
