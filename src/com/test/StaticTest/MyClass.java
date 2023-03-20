package com.test.StaticTest;

public class MyClass {

    int num;

    static int numStatic;
    public void method(){
        System.out.println("这是一个普通的方法");
        //成员方法能直接反问成员变量
        System.out.println(num);
        //成员方法能直接访问静态变量
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        //静态方法能直接访问静态参数
        System.out.println(numStatic);
        //静态不能直接访问静态[重点]
//        System.out.println(num);//错误
        //静态方法中不能使用this
//        System.out.println(this.num);//错误
    }
}
