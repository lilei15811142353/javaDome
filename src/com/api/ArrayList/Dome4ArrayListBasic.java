package com.api.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

/**
 * 如果希望向集合Arraylist中存储基本类型数据，必须使用基本类型对应的包装类
 *
 * 基本类型     包装类(引用类型，包装类都位于java.lang包下)
 * byte        Byte
 * short       Short
 * int         Integer
 * lang        Lang
 * float       Float
 * double      Double
 * char        Character
 * boolean     Boolean
 *
 * 从JDK1.5+，支持自动装箱，自动拆箱
 *
 * 自动类型：基本类型自动变成引用类型
 * 自动拆箱：包装类型自动变成基本类型
 */
public class Dome4ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        listB.add(11);
        System.out.println(listB);

        int num = listB.get(0);
        System.out.println("第一号元素是" + num);
    }
}
