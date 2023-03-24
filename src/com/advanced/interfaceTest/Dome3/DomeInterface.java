package com.advanced.interfaceTest.Dome3;
/**
 * 注意，不能通过接口实现类的对象来调用接口当中的静态方法
 * 
 * 正确用法：
 * 通过接口名称，直接抵用其中的静态方法
 * 接口名称.静态方法(参数)
 */
public class DomeInterface {
    public static void main(String[] args) {
        //没有必要的，直接用接口名称.静态方法就可以
        //  MyInterfaceStaticImpl impl  = new MyInterfaceStaticImpl(); 
         //错误写法
        //  impl.methodStatic();

        MyInterfaceStatic.methodStatic();
    }
}
