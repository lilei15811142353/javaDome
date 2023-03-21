package com.api.StringTest;

/**
 * String当中与转喊相关的常用方法
 *
 * public char[] toCharArray():将单签字符串拆分成为字符数组作为返回值
 * public byte[] getBytes():获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,CharSequence newSring)
 * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果字符串
 * 备注：CharSequence意思是可以接受字符串类型
 */
public class Dome5StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==============");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============");

        //字符串内容替换
        String str1 = "今天天气真好！";
        String  str2 = str1.replace("天","%");
        System.out.println(str1);
        System.out.println(str2);
    }
}
