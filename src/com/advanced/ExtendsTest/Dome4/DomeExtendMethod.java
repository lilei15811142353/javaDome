package com.advanced.ExtendsTest.Dome4;

/**
 *  在父子类的继承关系当中，创建子类对象，访问成方法的规则
 *       创建的对象是谁，就优先使用谁，如果没有则向上找父类,绝对不会向下找子类
 * 
 * 重写(Override)
 * 概念：在继承关系当中，方法的名称一样，参数列表也一样
 * 方法的名称一样，参数列表也一样，覆盖，复写
 * 
 * 重载
 * 方法名称一样，参数列表不一样
 * 
 * 方法的覆盖重写特点，创建的是子列对象，则优先子类方法
 */
public class DomeExtendMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();
        //创建的是new了子类对象，所有优先使用子类方法
        zi.method();
    }
    
}
