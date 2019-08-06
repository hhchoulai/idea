package com.neuedu.twenty_five;

public enum OrderEnum {
    NO_PAY(0,"未支付"),
    YES_PAY(1,"已支付"),
    OVER(2,"已发货")
    ;
    private Integer code;
    private String info;

    OrderEnum(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
    public static OrderEnum getOrder(Integer code){
        OrderEnum[] arr=OrderEnum.values();
        for (OrderEnum a : arr) {
            if (a.code.equals(code)){
                return a;
            }
        }
        return null;
    }
}
