package com.api.test.StringTest;

/**
 * 1.字符串的内容用不可变
 * 2.正式因为字符串不可改变，所以字符串是可以共享使用的
 * 3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组
 *
 * 创建字符串的常见3+1种方式
 * 三种构造方法+1中常见创建方式
 * public String(),创建一个空白字符串，不含有任何内容
 * public String(char[] array)，根据字符数组的内容，来创建对应的字符串
 * public String(byte[] array),根据字节数组的内容，来创建对应的字符串
 *
 * 一种直接创建
 * String str = "";
 * 直接协商双引号，就是字符串对象
 */
public class Dome1 {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();//小括号留空说明字符串中什么内容都没有
        System.out.println("第一个字符串：" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};//字节转换成英文就是ABC
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "hello";
        System.out.println("第四个字符串：" + str4);

    }
}
