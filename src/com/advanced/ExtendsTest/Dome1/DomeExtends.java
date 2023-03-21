package com.advanced.ExtendsTest.Dome1;

/**
 * 在继承的关系中，子类就是一个父类，也就是说。子类可以当做父类看待
 * 例如父类是员工，子类是讲师，那么讲师就是一个员工
 * 
 * 格式：
 * 父类：就是一个普通的类定义
 * public class 父类名称(){}
 * 子类
 * public class 子类名称 extends 父类名称
 */
public class DomeExtends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
    }
}
