package com.advanced.ExtendsTest.Dome8;

/**
 * super关键字的用法有三种
 * 1.再子类的成员方法中，访问父类的成员变量
 * 2.在子类的成员发放中，访问父类的成员发放
 * 3.在子类的构造方法中，访问父类的构造发放
 */
public class Zi extends Fu{
    int num = 30;

    public Zi(){
        super();
    }

    public void methodZi(){
        System.out.println(super.num);
        System.out.println(num);
    }
    public void method(){
        super.method();//访问父类中的method
        System.out.println("子类方法");
    }
}
