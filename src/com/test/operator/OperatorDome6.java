package com.test.operator;

public class OperatorDome6 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 9.8;
        double storage = 16;
        // 尺寸>=6.95,内存>=8
        System.out.println(size >=6.95 & storage >8); //必须前后都是TRUE
        System.out.println(size>7 | storage>20); //前后有一个TRUE就是返回TRUE
        System.out.println(!true);

        //必须前后结果不同，返回是TRUE
        System.out.println(false ^ true);

        // && 左边为false ，右边不执行
        System.out.println(size>10 && storage> 10);

        // || 左边为true，右边不执行
        System.out.println(size > 5 || storage >20);
    }
}
