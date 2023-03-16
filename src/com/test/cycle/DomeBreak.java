package com.test.cycle;

/**
 * 可以用在swich语句单重，一但执行，整个swich语句立刻结束
 * 还可以用在循环语句中，一但执行，整个循环语句立刻技术，打断循环
 *
 * 关于循环的选择
 * 凡是次数确定场景多用for循环，否则多用while循环
 */
public class DomeBreak {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            System.out.println("hello");
            if (i==4){
                break;
            }
            System.out.println("hello" + i);
        }
    }
}
