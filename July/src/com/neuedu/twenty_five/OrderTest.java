package com.neuedu.twenty_five;

public class OrderTest {
    public static void main(String[] args) {
        Order order=new Order(2);
        OrderEnum orderEnum=OrderEnum.getOrder(order.getOrderStatus());
        System.out.println(orderEnum.getInfo());
    }
}
