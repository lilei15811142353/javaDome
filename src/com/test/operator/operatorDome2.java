package com.test.operator;

public class operatorDome2 {
    public static void main(String[] args) {
        // 将3位数拆分为个位数，十位数，百位数
        int data = 123;
        int ge = data % 10;
        int shi = data /10 %10;
        int bai = data /100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
