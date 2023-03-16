package com.test.test;

public class PhoneClass {

    String brand;

    double price;

    String colour;

    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }

}
