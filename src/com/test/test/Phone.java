package com.test.test;

public class Phone {
    public static void main(String[] args) {
        PhoneClass phe = new PhoneClass();
        phe.brand = "华为";
        phe.colour= "绿色";
        phe.price = 3888.99;

        System.out.println("我买了一部" + phe.colour + "的" + phe.brand + "手机" + "价格是" + phe.price);

        phe.call("小刘");
        phe.sendMessage();
        System.out.println("==============================");

        PhoneClass pheNew = phe;
        System.out.println("我买了一部" + pheNew.colour + "的" + pheNew.brand + "手机" + "价格是" + pheNew.price);

        pheNew.brand = "三星";
        pheNew.colour="黑色";
        pheNew.price=5999.99;
        System.out.println("我买了一部" + pheNew.colour + "的" + pheNew.brand + "手机" + "价格是" + pheNew.price);
    }
}
