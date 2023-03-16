package com.api.test.ArrayList;

import java.util.ArrayList;

/**
 * 数组的长度不可以改变
 * 但是arraylist是可以改变的
 *
 * 对于allarylist来说，有一个尖括号<E>代表泛型
 * 泛型，也就是装在集合当中的所有元素，全都是统一的什么类型
 * 注意，泛型只能是引用类型，不能是基本类型
 *
 *
 * 注意事项
 * 对于arraylist集合来说。直接打印得到的不是地址值，是内容
 * 如果内容是空，得到的是空的中括号[]
 */
public class Dome1ArrayList {
    public static void main(String[] args) {
        //从jdk1.7开始，右侧的尖括号可以不写内容，但是不能省略
        ArrayList<String> list = new ArrayList<>();
        //想集合当中添加数据
        list.add("小天");
        list.add("小虎");
        System.out.println(list);

    }
}
