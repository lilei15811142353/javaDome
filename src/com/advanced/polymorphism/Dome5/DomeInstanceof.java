package com.advanced.polymorphism.Dome5;

/**
 * 如何才能知道一个父类引用的对象，本来是什么子类
 * 格式：
 * 对象Instanceof类型
 * 这将会得到一个Boolean值结果，也就是判断前面的对象能不能当做后面类型的实例
 */
public class DomeInstanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        //如果希望调用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.wathchHose();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.carchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.wathchHose();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.carchMouse();
        }

    }
    
}
