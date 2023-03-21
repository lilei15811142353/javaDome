package com.api.StringTest;

/**
 * 字符串常来那个池，程序当中直接协商的双引号字符串，就在字符串常量池中，
 * 对于基本类型来说，==是进行述职的比较
 * 对于引用类型来说，==是进行地址值的比较
 *
 * 注意：
 * 双引号直接写的字符串在常量池中，new的不在常量池中
 */
public class Dome2StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str2);

    }
}
