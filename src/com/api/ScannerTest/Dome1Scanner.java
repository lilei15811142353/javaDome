package com.api.test.ScannerTest;

import java.awt.*;
import java.util.Scanner;


/**
 * Scanner类的功能，可以实现键盘输入数据，到程序中
 * 引用累心给的一般使用步骤
 *
 * 1.导包
 * import 包路径，类名称
 * 如果需要使用目标类，和当前类位于同一个包下，则可以声乐导包语句不写
 * 只有java.lang包下的内容不需要导包，其他的包都需要import语句
 *
 * 创建
 * 类名称 对象名 =new 类名称()
 *
 * 使用
 * 对象名.成员方法名()
 *
 * 获取键盘输入的一个int数字，int num = sc.nextInt()
 * 获取键盘输入的一个字符串 String str = sc.next()
 */
public class Dome1Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in代表从键盘输入
        int num = sc.nextInt();
        System.out.println("输入的int数字：" + num);

        String str = sc.next();
        System.out.println("输入的字符串：" + str);

    }
}
