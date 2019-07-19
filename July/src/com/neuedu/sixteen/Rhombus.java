package com.neuedu.sixteen;

/**
 * 菱形
 */
public class Rhombus {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<4;i++){
            for (int j=i+1;j>0;j--){
                System.out.print(" ");
            }
            for (int j=4-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
