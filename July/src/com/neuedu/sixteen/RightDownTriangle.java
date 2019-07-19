package com.neuedu.sixteen;

/**
 * 数学的思想 观察其规律 俩条对角线
 * 0,0   0,1   0,2   0,3   0,4
 * 1,0   1,1   1,2   1,3   1,4
 * 2,0   2,1   2,2   2,3   2,4
 * 3,0   3,1   3,2   3,3   3,4
 * 4,0   4,1   4,2   4,3   4,4
 */
public class RightDownTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i+j>=4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
