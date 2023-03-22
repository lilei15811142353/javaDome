package com.advanced.ExtendsTest.Dome6;

public class NewPhone extends Phone{
    @Override
    public void show(){
        super.show();//super：调用父类方法
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
