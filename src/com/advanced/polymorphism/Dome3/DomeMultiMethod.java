package com.advanced.polymorphism.Dome3;

/**
 * 在多态的代码当中，成员方法的访问规则是
 *      看new的是谁，就优先用谁，没有则向上找
 * 
 * 注意：
 * 编译看左边，运行看右边
 * 
 * 对比一下
 * 成员变量，编译看左边，运行还看左边
 * 成员方法，编译看左边，运行看右边
 */

public class DomeMultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//父子都有。优先用子
        obj.methodFu();//子类没有，父类有，向上找到父类

        //编译看左，左边是Fu,Fu当中没有MethodZi方法，所有编译报错
        // obj.methodZi();//错误写法
    }
}
