package com.advanced.interfaceTest.Dome6;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {

    }

    @Override
    public void methodABC() {

    }

    @Override
    public void methodDefault(){
        //覆盖重写
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }

    
}
