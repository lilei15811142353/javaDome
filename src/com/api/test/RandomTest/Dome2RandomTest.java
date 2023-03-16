package com.api.test.RandomTest;

import java.util.Random;

public class Dome2RandomTest {
    //根据变量获取随机数字，范围是[1,n]
    public static void main(String[] args) {
        int n = 5;
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            int mun = rd.nextInt(n) + 1;
            System.out.println(mun);
        }
    }
}
