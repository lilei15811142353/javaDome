package com.advanced.FinalTest.Dome3;

import cn.mxdx.test.one.student;

public class DomeFinal {
    
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num = 20;
        System.out.println(num);
        
        //一旦使用final修饰局部变量，那么这个变量就不能进行更改
        //一旦复制，终生不变
        final int num1 = 200;
        //错误写法
        // num1 = 250
        // num2 = 200

        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的是变量当中的数值不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变

        Student stu1 = new Student("小龙");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("小马");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        System.out.println("==================");

        final Student stu2 = new Student("小天");
        System.out.println(stu2.getName());
        //错误写法，final的引用类型变量，其中的地址不可改变
        // stu2 = new Student("小虎");
        stu2.setName("小虎");
        System.out.println(stu2.getName());
    }
}
