package com.test.day2.method;

public class Dome3Method {
    //定义一个方法，求出两个数字之和
    public static int sumNum(int a,int b){
        int result = a+b;
        return result;
    }

    public static void printSum(int a,int b){
        System.out.println("两个数字之和是：" + (a+b));
    }

    public static void main(String[] args) {
        int sum = sumNum(4,10);
        System.out.println(sum);

        printSum(50,100);
    }
}
