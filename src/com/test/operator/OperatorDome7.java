package com.test.operator;

public class OperatorDome7 {
    public static void main(String[] args) {
        // 三元运算符
        double score = 98;
        String rs = score >= 60 ? "考试通过":"挂科";
        System.out.println(rs);

        // 需求从2个整数中找出加大至
        int a = 10111;
        int b = 2000;
        int max = a >= b ? a:b;
        System.out.println(max);

        System.out.println("----------------");
        int i = 10;
        int j = 29;
        int k = 50;
        //找出两个整数的较大值
        int temp = i>j ? i:j;
        int res = temp > k ? temp:k;
        System.out.println(res);

        System.out.println("-----------------");
        int resMax1 = i >j ? i>k ? i:k:j>k?j:k;
        System.out.println(resMax1);
    }
}
