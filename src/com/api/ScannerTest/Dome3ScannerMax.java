package com.api.ScannerTest;

import java.util.Scanner;

/**
 * 键盘输入三个数字，求出最大值
 */
public class Dome3ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int temp = A>B ?A:B;
        int max = temp > C ? temp:C;
        System.out.println("最大值是" + max);
    }
}
