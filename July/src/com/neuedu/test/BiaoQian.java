package com.neuedu.test;

/**
 * 打标签
 */

public class BiaoQian {
    public static void main(String[] args) {
      ok:  for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    break ok;
                }
            }
        }
    }
}
