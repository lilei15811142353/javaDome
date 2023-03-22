package com.advanced.interfaceTest.Dome2;

/**
 * 接口的默认发放，可以通过接口实现类对象，直接调用
 * 接口的默认发放，也可以被接口实现类进行覆盖重写
 */
public class InterfaceDome {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodABs();//调用抽象方法，实际运行的右侧实现类

        //调用默认发放，如果实现类当中没有，回向上找接口
        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodABs();
        b.methodDefault();
    }
    
}
