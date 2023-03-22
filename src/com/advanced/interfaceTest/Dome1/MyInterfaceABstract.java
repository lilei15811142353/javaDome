package com.advanced.interfaceTest.Dome1;

/**
 * 再任何版本的java种，接口都能定义抽象方法
 * 
 * public abstract 返回值类型 方法名称(参数列表)
 * 
 * 注意事项
 * 1.接口当中的抽象发放，修饰符必须是两个固定的关键字，public abstract
 * 2.这两个关键字修饰符，可以选择性忽略。
 * 3.方法的三要素可以随意定义
 */
public interface MyInterfaceABstract {
    //这是一个抽象发方法
    public abstract void methodABs();

    //下面三个都是抽象方法
    abstract void methodABs1();

    public void methodABs2();

    void methodABs3();
}
