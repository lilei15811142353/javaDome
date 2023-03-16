package com.test.operator;

public class operatorDome3 {
    public static void main(String[] args) {
        //自增、自减
        int a = 10;
        a++;
        ++a;
        System.out.println(a);

        int b = 20;
        b--;
        --b;
        System.out.println(b);


        System.out.println("-----------------");
        // 表达式中或者不是单独操作的情况 ++ --再变量前后存在的区别
        // ++ -- 在变量前面，先+1 -1 再使用
        int i = 10;
        int j = ++i;
        System.out.println(i);
        System.out.println(j);

        System.out.println("++++++++++++++++++");
        int m = 10;
        int n = m++;
        System.out.println(n);
        System.out.println(m);
    }
}
