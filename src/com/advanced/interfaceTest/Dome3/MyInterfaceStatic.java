package com.advanced.interfaceTest.Dome3;


/**
 * 从java8开始，接口中允许定义静态方法
 * 格式
 * pubilc static 返回值类型，反方名称(参数列表){方法体}
 * 
 * 提示。就是将abstract获这defalut换成static即可，带上方法体
 */
public interface MyInterfaceStatic {

    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
    
}
