package com.test.day3;

/**
 * 通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用
 *
 * 导包，也就是需要指出需要使用的类，在什么位置
 * import 包名称.类名称
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写
 *
 * 创建
 * 格式：类名称 对象名=new 类名称()
 *
 * 使用：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * 也就是，想用谁，就用对象名点谁
 */
public class DomeStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "haha";
        System.out.println(stu.name);

        stu.eat();
    }
}
