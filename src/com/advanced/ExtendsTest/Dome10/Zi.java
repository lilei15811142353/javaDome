package com.advanced.ExtendsTest.Dome10;

public class Zi extends Fu{
    int num = 40;
    @Override
    public void method(){
        super.method();//调用了父类方法
        System.out.println("子类方法");
    }

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
