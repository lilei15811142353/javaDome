package com.test.test;

/**
 * 当使用一个对象类型作为方法的返回值时
 * 返回值其实就是这个对象
 */
public class PhoneReturn {
    public static void main(String[] args) {
        PhoneClass two = getPhone();
        System.out.println(two.colour);

    }

    public static PhoneClass getPhone(){
        PhoneClass one = new PhoneClass();
        one.colour = "黑色";
        one.price=7888.99;
        one.brand="苹果";

        return one;
    }
}
