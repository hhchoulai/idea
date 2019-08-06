package com.neuedu.twenty_three;




    public class Check {
        public static void main(String args[]) {
            Holder h = new Holder();
            h.held = 100;
            h.bump(h);
            System.out.println(h.held);
        }
    }
