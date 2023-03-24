package com.advanced.interfaceTest.Dome7;

/**
 * 这个子接口当中有4个方法
 * methodA:来源于接口A
 * methodB:来源于接口B
 * methodCommon:来源于接口A和B
 * method:来源于自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault(){
        
    }    
}
