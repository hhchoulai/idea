package com.neuedu.twenty_four;

public class Card {
    private String face;//牌面
    private String suit;//花色

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    protected String getFace(){
        return face;
    }
    protected String getSuit(){
        return suit;
    }

    @Override
    public String toString() {
        return suit+face;
    }
}
