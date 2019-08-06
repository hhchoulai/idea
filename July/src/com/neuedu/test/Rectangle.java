package com.neuedu.test;

/**
 * 判断矩形相交
 */
public class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
//  判断是否相交
    public boolean intersect(Rectangle rectangle){
        if (Math.abs(this.x-x)<=width && Math.abs(this.y-y)<=height){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,3,4,3);
        Rectangle r2=new Rectangle(4,2,4,3);
        System.out.println(r1.intersect(r2));
    }

}
