package com.api.RandomTest;

import java.util.Random;
import java.util.Scanner;

/**
 * 用代码模拟猜数字的小游戏
 *
 * 1.首先需要产生一个随机数字，并且一旦产生不再变化，用random的nextInt方法
 * 2.需要键盘输入，所以用到Scanner
 * 3.获取键盘输入的数字，用Scanner当中的nextInt方法
 * 4.已经得到两个随机数字，判断(if)一下三种情况
 *  如果太大了，提示太大，并且重试
 *  如果太小了，提示太大，并且重试
 *  如果猜中了，有戏结束
 * 5.重试就再来一次，循环次数不确定，用while(true)
 */
public class Dome3RandomGame {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你的猜测");
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("太大了，请重试");
            } else if (guessNum < num) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
