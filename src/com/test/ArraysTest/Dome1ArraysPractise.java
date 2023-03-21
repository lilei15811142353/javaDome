package com.test.ArraysTest;

import java.util.Arrays;

/**
 * 请使用Arrays相关API，将一个随机字符串中的所有字符升序排序，倒叙打印
 */
public class Dome1ArraysPractise {
    public static void main(String[] args) {
        String str = "hfuewfhwefhaldfjiofjei";
        //如何进行升序排列，sort
        //必须是一个数组，才能用Arrays.sort方法
        //String --> 数组，用toCharArray
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        //遍历数组
        for (int i = charArray.length -1 ; i >= 0 ; i--){
            System.out.println(charArray[i]);
        }
    }
}
