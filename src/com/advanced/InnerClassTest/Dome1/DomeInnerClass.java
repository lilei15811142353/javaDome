package com.advanced.InnerClassTest.Dome1;

/**
 * 如果一个事物的内部包含另一个事务，那么这就是一个类内部包含另一个类
 * 例如：身体和心脏的关系，又如汽车和发动机的关系
 * 
 * 
 * 分类
 * 1.成员内部类
 * 2.局部内部类(包含匿名内部类)
 * 
 * 
 * 成员内部类的定义格式
 * 修饰符 class 外部类名称{
 *      修饰符 class 内部类名称{
 *    }
 * }
 * 
 * 注意：
 * 内部类使用外部类，可以随意访问，外部类使用内部类，一定需要内部类对象
 * 
 * =============
 * 如何使用成员内部类
 * 1.间接方式：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
 * 2.直接方式：
 *      格式：
 *          外部类名称.内部类名称 对象名 = new 外部类名称.new 内部类名称();
 */
public class DomeInnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

        System.out.println("===============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
