package com.neuedu.test;

import java.util.*;
/**
 * Map中 entry对象的使用
 */

public class Entry {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        Set<Map.Entry<Integer,String>> set=hashMap.entrySet();
        for (Map.Entry<Integer, String> s : set) {
            System.out.println(s);
        }

        System.out.println();

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,"a");
        linkedHashMap.put(2,"b");
        linkedHashMap.put(3,"c");
        Set<Map.Entry<Integer,String>> set1=linkedHashMap.entrySet();
        for (Map.Entry<Integer, String> s1 : set1) {
            System.out.println(s1);
        }

        Set<Map.Entry<Integer,String>> set2=hashMap.entrySet();
        for (Map.Entry<Integer, String> i : set2) {
            i.setValue("sd");
            System.out.println(i);
        }


    }
}

