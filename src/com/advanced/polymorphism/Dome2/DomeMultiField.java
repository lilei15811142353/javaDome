package com.advanced.polymorphism.Dome2;

/**
 * 访问成员变量的两种方式
 * 1.直接通过对象名称访问成员变量：看等号左边是谁，优先是谁，没有则向上找
 * 2.间接通过成员方法访问成员变量:看该方法属于谁，邮箱使用谁，没有则向上找
 */
public class DomeMultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
        // System.out.println(obj.age);//错误写法！，父类中没有的话，则向上找，不会向下找

        System.out.println("============");
        
        //子类没有覆盖重写，就是父，10
        //子类如果覆盖重写，就是子，20
        obj.showNum();
    }
    
}
