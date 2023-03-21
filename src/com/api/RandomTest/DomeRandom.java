package com.api.RandomTest;

import java.util.Random;

/**
 * random类用来生成随机数字，使用起来也是三个步骤
 * 1.导包
 * 2.创建
 * 3.使用
 *
 */
public class DomeRandom {
    public static void main(String[] args) {
        Random rd = new Random();
        //获取随机的int数字
        int num = rd.nextInt();
        System.out.println("随机数是：" + num);
    }

}
