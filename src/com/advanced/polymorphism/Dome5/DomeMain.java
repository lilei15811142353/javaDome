package com.advanced.polymorphism.Dome5;

/**
 *  向上转型一定是安全的，没有问题的，，正确的，但是也有一个弊端：
 *  对象一单向上转型为父类，那么久无法调用子类原本特有的内容
 * 解决方案：用对象的向下转型【还原】
 */
public class DomeMain {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        // animal.catchMouse();//错误写法

        //向下转型没进行还原
        Cat cat = (Cat) animal;
        cat.carchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫。非要变成一只狗
        // Dog dog = (Dog) animal;
    }
    
}
