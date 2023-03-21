package com.api.test.RandomTest;

import java.util.Random;

public class Dome1Random {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rd.nextInt(10);
            System.out.println(num);
        }
    }
}
