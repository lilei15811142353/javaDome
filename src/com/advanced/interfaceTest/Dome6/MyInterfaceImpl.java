package com.advanced.interfaceTest.Dome6;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodB() {
        System.out.println("覆盖重写了A");
    }

    @Override
    public void methodA() {
        System.out.println("覆盖重写了B");
    }
    @Override
    public void methodABC(){
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodDefault(){
         System.out.println( "对多个接口当中冲突的默认方法进行覆盖重写");
    }
}
