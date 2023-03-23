package com.advanced.interfaceTest.Dome2;

/**
 * 从java 8 开始，接口里允许定义默认方法
 * 
 * 格式
 * public default 返回值类型 方法名称(参数列表){}
 * 
 * 备注：接口当中的默方法，可以解决接口中升级的问题
 */
public interface MyInterfaceDefault {
    //抽象发放
    public abstract void methodABs();
    //新添加的一个抽象发放

    // public abstract void methodABs2();
    //新添加的方法，改成默认方法

    public default void methodDefault(){
        //这是新添加的默认方法
        System.out.println("这是新添加的默认方法");
    }
}
