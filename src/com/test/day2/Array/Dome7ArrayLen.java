package com.test.day2.Array;

/**
 * 如何获取数组长度
 * 数组名称.length---->返回一个int类型数字
 *
 * 数组一旦创建，程序运行期间，长度不可改变
 */
public class Dome7ArrayLen {
    public static void main(String[] args) {
        int[] array = new int[3];
        int[] arrayB = new int[]{1,2,3};
        int lens = arrayB.length;
        System.out.println(lens);


        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
