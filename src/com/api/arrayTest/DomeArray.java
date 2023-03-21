package com.api.arrayTest;

import java.sql.Array;
import java.util.Arrays;

/**
 * 数组有一个缺点，一旦数组创建，程序运行期间，长度不可以发生改变
 */
public class DomeArray {

    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        DomePerson[] array = new DomePerson[3];
        DomePerson one = new DomePerson("小天",22);
//        DomePerson two = new DomePerson("小虎",33);
//        DomePerson three = new DomePerson("小马",44);

        array[0] = one;

        System.out.println(array[0].getName());
    }
}
