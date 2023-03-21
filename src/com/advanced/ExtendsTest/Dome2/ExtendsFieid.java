package com.advanced.ExtendsTest.Dome2;

import javax.sound.sampled.SourceDataLine;

/**
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象有两种访问方式
 * 
 * 直接通过子类对象访问成员变量
 *      等号左边是谁，就优先用谁，没有则向上找
 * 简介通过成员方法访问成员变量
 *      方法属于谁。就优先用谁，没有则向上找
 */
public class ExtendsFieid {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能用父类的东西。没有任何子类内容

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("===================");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num); //优先子类
        System.out.println("=====================");

        //这个方法是子类的，优先用子类的。没有再向上找
        zi.methodZi();
        //这个方法是在父类当中定义的
        zi.methodFu();
    }
}
