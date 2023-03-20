package com.test.StaticTest;

/**
 * 一旦使用static修饰成员发放，那么这就成为了静态方法，静态发放不属于对象，而属于类的
 *
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 * 如果有了static关键字，那么不需要创建对象，直接就通过类名称来使用它
 *
 *注意事项
 * 1.静态不能直接访问非静态
 * 原因：因为内存当中是先有得静态内容，后有的非静态内容
 * 2.静态方法中不能用this
 * 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Dome2Myclass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于京塔方法来说。可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();//正确，不推荐，这种写法再编译之后也会被javac翻译成为【类名称.静态方法名】
        MyClass.methodStatic();//推荐使用

        //
        myMethod();
    }

    public static void myMethod(){
        System.out.println("这是一个自己的方法");
    }
}
