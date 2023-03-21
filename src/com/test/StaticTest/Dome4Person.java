package com.test.StaticTest;

/**
 * 静态代码块格式
 * public class 类名(){
 *     static{
 *          代码块内容
 *     }
 * }
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 * 静态内容总是优先于非静态，所以静态代码块比构造发放先执行
 */
public class Dome4Person {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
    
}