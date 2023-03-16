package com.api.test.AnonymousTest;

import java.util.Scanner;

/**
 * 使用匿名对象作为方法的参数和返回值
 */
public class Dome2Anonymous {
    public static void main(String[] args) {
//        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//
//
//        //使用匿名对象方式
//        int num2 = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num2);
//
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是：" +num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
