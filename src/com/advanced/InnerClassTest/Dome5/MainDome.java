package com.advanced.InnerClassTest.Dome5;

/**
 * 如果接口的实现类(或者父类的子类)只需要使用唯一的一次
 * 那么这种情况下就可以省略掉该类的定义，，而改为使用【匿名内部类】
 * 
 * 定义匿名内部类的格式
 * 接口名称 对象名 = new 接口名称(){
 *      覆盖重写所有抽象方法
 * }
 *
 *
 * 对格式进行解析：new 接口名称(){....}
 * 1.new代表创建对象的动作
 * 2.接口名称就是匿名内部类需要实现哪个接口
 * 3.{....}这才是匿名内部类的内容
 *
 *
 * 另外还要注意几点问题
 * 1.匿名内部类，在创建对象的时候只能使用唯一一次
 * 如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了
 * 2.
 */
public class MainDome {
    public static void main(String[] args) {
        // MyInterface obj = new MyInterfacImpl();
        // obj.method();

        // MyInterface some = new MyInterface();//错误写法

        //使用匿名内部类

        MyInterface objA = new MyInterface() {
            @Override
            public void methodA(){
                System.out.println("匿名内部类A");
            }

            @Override
            public void methodB(){
                System.out.println("匿名内部类B");
            }
        };
        objA.methodA();

        MyInterface objB = new MyInterface() {
            @Override
            public void methodA() {
                    System.out.println("匿名内部类A");
            }

            @Override
            public void methodB() {
                System.out.println("匿名内部类B");
            }
        };
        objB.methodA();
    }
}
