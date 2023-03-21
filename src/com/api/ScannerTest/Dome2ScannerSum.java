package com.api.ScannerTest;

import java.util.Scanner;

/**
 * 键盘输入两个int数字，并且求和
 */
public class Dome2ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("两个数的和是:" + (A+B));
    }

}
