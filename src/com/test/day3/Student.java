package com.test.day3;

/**
 * 成员变量是直接定义在类中，在方法外面
 * 成员方法不要写static关键字
 */
public class Student {
    //成员变量
    String name ;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }
}
