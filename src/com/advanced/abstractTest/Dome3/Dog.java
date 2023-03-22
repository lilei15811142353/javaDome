package com.advanced.abstractTest.Dome3;

//子类必须也是一个抽象类
public abstract class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    // @Override
    // public void sleep(){

    // }
}
