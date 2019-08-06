package com.neuedu.twenty_five;

public class Plane {
    Direction dir=Direction.UP;

    void move() {
        switch (dir) {
            case UP:
                System.out.println(1);
                break;
            case DOWN:
                System.out.println(2);
                break;
            case LEFT:
                System.out.println(3);
                break;
            case RIGHT:
                System.out.println(5);
                break;
        }
    }

    public static void main(String[] args) {
        Plane p = new Plane();
//        Direction dir=Direction.UP;
        p.move();
    }
}
