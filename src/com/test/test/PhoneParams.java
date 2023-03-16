package com.test.test;

public class PhoneParams {

    public static void main(String[] args) {
        PhoneClass one = new PhoneClass();
        one.brand = "苹果";
        one.price = 8777.99;
        one.colour="黑色";
        method(one);    //传递进去的参数就是地址值
    }
    public static void method(PhoneClass params){
        System.out.println(params.brand);
        System.out.println(params.colour);
    }
}
