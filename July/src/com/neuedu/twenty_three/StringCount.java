package com.neuedu.twenty_three;

public class StringCount {
    int count;
    public int find(String input, String target){
        /*for (int i = 0; i <=input.length() - 3; i++) {
            String s=input.substring(i,i+3);
            if (s.equals(target)){
                count++;
            }
        }*/
        int pos=0;
        while ((pos=input.indexOf(target,pos))!=-1){
            pos+=3;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        StringCount sc=new StringCount();
        StringCount s=new StringCount();
        String input = "I like dogs,I have a dog.It's name is BigdogBoydog";
        String target = "dog";
        String t = "W";
        int x = sc.find(input, target);
        int y = s.find(input, t);
        System.out.println(x);
        System.out.println(y);
    }
}
