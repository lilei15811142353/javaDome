package com.advanced.interfaceTest.Dome6;

public interface MyInterfaceB {
    
    //错误写法,接口不能有静态代码块
    // static{}

    //错误写法，接口不能有构造方法
    // public MyInterface(){}

    public abstract void methodB();

    public abstract void methodABC();

    public default void methodDefault(){
        System.out.println("默认方法BBBBBBB");
    }

}
