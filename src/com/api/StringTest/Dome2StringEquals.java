package com.api.StringTest;

/**
 * ==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
 *
 * public boolean equals(Object obj),参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
 *
 *
 * 注意事项
 * 1.任何对象都能用Object进行接受
 * 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 * 3.如果比较双方一个常量和一个变量，推荐把常量字符串放在前面
 *
 * 另一个比较方法
 * public boolean equalsIgnoreCase(String str)：忽略大小写进行比较
 */
public class Dome2StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equals(str1));
        System.out.println(str3.equals("Hello"));


        System.out.println("============");

        String str5 = "abc";
//        String str5 = null;//假如将abc换成null,不推荐的比较就会报空指针
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐

        System.out.println("==============");
        String strA = "hello";
        String strB = "Hello";
        System.out.println(strB.equals(strA));//严格按照大小写对比
        System.out.println(strB.equalsIgnoreCase(strA));//忽略大小写
    }

}
