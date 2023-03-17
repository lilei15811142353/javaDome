package com.api.test.StringTest;

/**
 * 字符串的截取方法
 * public String subString(int index):截取从参数位置一直到字符串末尾，返回新字符串
 * public String subString(int begin,int end),截取从begin开始，一直到end结束，中间的字符串
 * 备注(begin,end)包含左边，不包含右边
 */
public class Dome4Substring {
    public static void main(String[] args) {
        String str1 = "HelloWord";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("================");

        String str3 = str1.substring(4,7);
        System.out.println(str3);
        System.out.println("==============");

        //下面这种写法,字符串的内容然然是没有改变的
        //下面有两个字符串，hello和java
        //strA当中保存的是地址值
        //本来是地址值是hello
        //后来地址值变成java
        String strA = "hello";
        System.out.println(strA);
        strA = "java";
        System.out.println(strA);
    }
}
