package com.api.test.ArrayList;

import java.util.ArrayList;

/**
 * 自定义4个学生对象，添加到集合，并遍历
 *
 * 思路：
 *
 */
public class ArrayListTestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("黄岛主",21);
        Student three = new Student("欧阳锋",22);

        list.add(one);
        list.add(two);
        list.add(three);

        for (int i = 0; i < list.size(); i++) {
             Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄:" + stu.getAge());
        }
    }
}
