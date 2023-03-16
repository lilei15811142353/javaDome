package com.api.test.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Dome3ArraryListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小虎");
        list.add("姿态");
        list.add("ming");
        list.add("Uzi");
        list.add("mlxg");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
