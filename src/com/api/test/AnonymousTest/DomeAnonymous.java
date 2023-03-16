package com.api.test.AnonymousTest;


/**
 * 匿名对象
 * 只有右边的对象，没有左边的名字和复制运算符
 * new 类名称()
 *
 * 匿名对象只能使用唯一的一次，下一次使用必须再创建一个新的对象
 * 使用建议：
 * 如果确定各有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class DomeAnonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "小娃娃";
        one.showName();
        System.out.println("================");


        //匿名对象
        new Person().name="小天";

    }
}
