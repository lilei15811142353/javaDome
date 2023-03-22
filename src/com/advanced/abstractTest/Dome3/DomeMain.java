package com.advanced.abstractTest.Dome3;

public class DomeMain {
    public static void main(String[] args) {
        // Animal animal = new Animal();//错误，抽象类
        // Dog dog = new Dog();//错误，抽象类
        // DogGolden dogGolden = new DogGolden();
        // dogGolden.sleep();
        // dogGolden.eat();

        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
    }
}
