package com.neuedu.twenty_five;

public class Order {
    private Integer orderStatus;

    public Order(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderStatus=" + orderStatus +
                '}';
    }
}
