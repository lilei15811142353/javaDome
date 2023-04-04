package com.advanced.InnerClassTest.Dome7;

import java.util.ArrayList;
import java.util.List;

public class DomeInterface {
    public static List<String> addName (List<String> list){
        list.add("小龙");
        list.add("小虎");
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小飞");
        List<String> result = addName(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
