package com.advanced.modifierTest;

public class MyAnother {

    public void anotherMethod(){
        System.out.println(new MyClass().num1);
        System.out.println(new MyClass().num2);
        System.out.println(new MyClass().num3);

        //num4是private修饰
        // System.out.println(new MyClass().num4);

    }
    
}
