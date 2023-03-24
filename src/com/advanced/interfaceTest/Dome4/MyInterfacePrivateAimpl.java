package com.advanced.interfaceTest.Dome4;

public class MyInterfacePrivateAimpl implements MyInterfacePrivateA{

    public void methodAnother(){
        //直接访问到了接口中的默认方法，错误写法
        methodCommon();
    }
    
}
