package com.advanced.interfaceTest.Dome2;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodABs() {
        System.out.println("实现了抽象发放，BBBB");

    }

    @Override
    public void methodDefault(){
        System.out.println("实现类B覆盖重新了接口的默认方法");
    }
    
}
