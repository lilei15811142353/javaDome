package com.advanced.polymorphism.Dome5;

public class Cat extends Animal{
    
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void carchMouse(){
        System.out.println("猫抓老鼠");
    }
}
