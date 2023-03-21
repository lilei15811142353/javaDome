package com.api.StringTest;

/**
 * public String[] split(String str):按照参数的规则，将字符串切分成若干部分
 *
 * 注意事项
 * split方法的参数其实是一个正则表达式，如果按照英文"."切割，，必须写"\\."
 */
public class Dome6StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] arrayString = str1.split(",");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        System.out.println("===============");

        String str2 = "ddd eee fff";
        String[] arrayString2 = str2.split(" ");
        for (int i = 0; i < arrayString2.length; i++) {
            System.out.println(arrayString2[i]);
        }


        String str3 = "XXX.ZZZ.YYY";
        String[] arrayString3 = str3.split("\\.");
        System.out.println(arrayString3.length);
        for (int i = 0; i < arrayString3.length; i++) {
            System.out.println(arrayString2[i]);
        }
    }
}
