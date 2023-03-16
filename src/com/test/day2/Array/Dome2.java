package com.test.day2.Array;

/**
 * 动态初始化（指定长度）：在创建数组的时候，直接指定数据当中的数据元素个数
 * 动态初始化（指定内容），在创建数组的时候，不直接指定数据个数多少，而是直接将局的的数据内容进行指定
 *
 * 静态初始化数据格式
 * 数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，元素3，。。。。}
 *
 * 注意事项：
 * 虽然静态初始化没有指定数组长度，但是根据大括号里面的元素具体内容，也可以自动推算出来长度
 */
public class Dome2 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{2,3,4,5};

        String[] arrayV = new String[]{"hello","world"};
    }
}
