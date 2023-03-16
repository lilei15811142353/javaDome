package com.test.day2.Array;


/**
 * 访问数组元素的格式，数组名称[索引值]
 */
public class Dome4 {

    public static void main(String[] args) {
        int[] arrayA = new int[]{1,2,3};

        //直接打印数组，得到的是数组对应的，内存地址哈希值
        System.out.println(arrayA);

        System.out.println(arrayA[0]);

        int num = arrayA[1];
        System.out.println(num);
    }
}
