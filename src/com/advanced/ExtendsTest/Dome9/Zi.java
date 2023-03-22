package com.advanced.ExtendsTest.Dome9;

/**
 * super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在蓓蕾的成员方法中，访问本的另一个成员变量
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 *      this()调用也必须是构造方法的第一个语句，唯一的一个
 *      super()和this()两种构造调用，不能同时使用
 */
public class Zi extends Fu{
    
    int num = 20;

    public Zi(){
        // super();//这一行不再赠送
        this(123);//本类的午餐构造，调用本类的有参构造
        // this(2,3);//错误写法，this()调用也必须是构造方法的第一个语句
    }

    public Zi(int n){
        this(2,3);
    }

    public Zi(int a ,int b){
        // this();错误写法，与一个无参数，有一个参数行程循环
    }

    public void method(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }
    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
