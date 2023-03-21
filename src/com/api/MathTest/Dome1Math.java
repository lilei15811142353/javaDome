package com.api.MathTest;

/**
 * Dome1Math
 * java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
 * 
 * public static double abs(double num) 获取绝对值
 * public static double cell(double num) 向上取整
 * public staitc double flool(double num) 向下取整
 * public static double round(double num) 四舍五入
 * 
 * Math.PI代表近似的圆周率常量
 */
public class Dome1Math {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println("=======获取绝对值=======");
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-1.1));
        

        //向上取整
        System.out.println("========向上取整=======");
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(2.0));

        //向下取整
        System.out.println("========向下取整========");
        System.out.println(Math.floor(2.9));
        System.out.println(Math.floor(2.0));

        //四舍五入
        System.out.println("========四舍五入========");
        System.out.println(Math.round(20.55));
        System.out.println(Math.round(20.33));

        System.out.println("==========Math.PI========");
        System.out.println(Math.PI);
    }
}