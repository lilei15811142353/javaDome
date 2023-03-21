package com.api.test.StringTest;

/**
 * String中与获取相关的常用方法是
 * public int length():获取字符串中含有字符格式，拿到字符串长度
 * public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
 * public char charAT(int index):获取指定所以位置的单个字符
 * public intindexOf():查找参数字符串在本字符串当中首次出现索引位置，如果没有返回-1值
 */
public class Dome3StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "gfjkshfsdf".length();
        System.out.println("字符串长度是："+length);

        //拼接字符串
        String str1 = "hello";
        String str2 = "Word";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果没有的话，就返回-1
        String original = "HelloWordHelloWord";
        int index =original.indexOf("llo");
        System.out.println("第一次索引值是：" + index);
        System.out.println("HelloWord".indexOf("abc"));
    }
}
