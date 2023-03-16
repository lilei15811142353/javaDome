package com.test.day2.methodOverload;

public class DomeMethodOverloadSame {
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte");
        boolean same ;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b){
        System.out.println("两个short");
        boolean same = a==b ? true:false;
        return same;
    }

    public static boolean issame(int a ,int b){
        System.out.println("两个int");
        return a==b;
    }

    public static boolean issame(long a,long b){
        System.out.println("两个long");
        boolean same ;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }

    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        System.out.println(isSame(a,b));
    }
}
