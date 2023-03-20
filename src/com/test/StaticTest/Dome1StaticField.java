package com.test.StaticTest;

/**
 * 如果一个成员变量使用了static关键字，那么这个变脸不再属于自己，而是属于所在的类。多个对象共享同一个类
 */
public class Dome1StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 20);
        one.room = "102教室";
        System.out.println("学号是：" + one.getId() + "姓名：" + one.getName() + ",年龄+：" + one.getAge() + ",教室是：" + one.room);
        Student two = new Student("黄蓉", 18);
        System.out.println("学号是：" +two.getId() + "姓名：" + two.getName() + ",年龄+：" + two.getAge() + ",教室是：" + two.room);
    }
}
