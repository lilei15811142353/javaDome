package com.api.test.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存入20个随机数字。然后筛选其中的偶数元素，放到小集合里面
 * 要求使用自定义方法来实现筛选
 */
public class Dome6ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            biglist.add(num);
        }
        ArrayList<Integer> smallList = getsmallList(biglist);
        System.out.println("大集合：" + biglist);
        System.out.println("小集合:" +smallList);
        System.out.println("偶数一共有：" + smallList.size() + "个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    public static ArrayList<Integer> getsmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int  num = list.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
