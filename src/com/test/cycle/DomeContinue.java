package com.test.cycle;

/**
 * 一但执行，立刻跳过当前次循环内容，马上开始下一次循环
 */
public class DomeContinue {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            if (i == 4){ //如果i=4，跳过当前循环，进行下一次循环
                continue;
            }
            System.out.println(i +"层到了");
        }
    }
}
