package com.test.type;

public class TypeDome2 {
    public static void main(String[] args) {
        //表达式的自动类型转换规则

        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);

        byte i = 10;
        byte j = 20;
        int k = i + j;// byte、short、char参加运算的时候，要转换成int运算
        System.out.println(k);
    }
}
