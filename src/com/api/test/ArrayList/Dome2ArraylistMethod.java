package com.api.test.ArrayList;


import java.util.ArrayList;

/**
 * arraylist常用方法
 *
 * public booblean add(E e)，向集合当中添加元素，参数的类型和泛型一样
 * public E get(int index)，从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
 * public E remove(int index)，从集合中删除元素，删除是索引编号，返回值就是被删除的元素
 * punlic int size()，获取集合的尺寸长度，返回值是集合中包含元素的个数
 *
 * 备注：对于Arraylist集合来说。add天假动作一定是成功的，所以返回值可用不可用
 */
public class Dome2ArraylistMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("小天");
        System.out.println(list);
        System.out.println("添加的动作是否成功" + success);

        list.add("小虎");
        list.add("UZI");

        //从集合中获取元素：get
        String name = list.get(0);
        System.out.println(name);

        //从集合中删除元素，remove
        String whoRemove = list.remove(0);
        System.out.println("被删除的人是:" + whoRemove);
        System.out.println(list);

        //获取集合的长度
        int size = list.size();
        System.out.println("集合的长度:" + size);

    }
}
