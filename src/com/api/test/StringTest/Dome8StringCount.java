package com.api.test.StringTest;

import java.util.Scanner;

/**
 *键盘输入一个字符串，并统计其中各字符种类出现的次数
 #种类有，大写字母，小写字母，数字，其他
 #
 */

 /**
  * Dome8StringCount
  */
 public class Dome8StringCount {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();

        int countUper = 0;
        int countlower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z'){
                countUper++;
            }else if('a' <= ch && ch <= 'z'){
                countlower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有：" + countUper);
        System.out.println("小写字母有：" + countlower);
        System.out.println("数字字母有：" + countNumber);
        System.out.println("其他字母有：" + countOther);
    }
 }