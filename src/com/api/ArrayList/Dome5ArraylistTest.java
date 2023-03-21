package com.api.ArrayList;

import java.util.ArrayList;

/**
 * 定义以指定格式打印集合的方法(Arraylist类型作为参数)，使用()括起来集合，使用@分割每个元素
 * 格式参照{元素@元素@元素}
 */
public class Dome5ArraylistTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size()-1) {
                System.out.print(name + "}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
