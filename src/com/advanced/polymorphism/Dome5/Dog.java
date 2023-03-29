package com.advanced.polymorphism.Dome5;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    
    public void wathchHose(){
        System.out.println("狗看家");
    }
}
