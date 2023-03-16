package com.test.day2.method;

/**
 * 方法就是若干语句的功能集合
 *
 * 参数：进入方法的数据
 * 返回值：从方法出去来的数据
 *
 * 定义方法的完整格式
 * 修饰符 返回值类型 方法名称(参数名称,参数名称2...){
 *     方法体
 *     return 返回值;
 * }
 * 修饰符：固定写法public static
 * 返回值类型：方法最终产生的数据结果是什么类型
 * 参数名称：进入芳芳的数据对应的变量名称
 * return：有两个作用，第一个停止当前方法，第二将后面的返回值还给调用处
 * 返回值，也就是放放执行后最终产生的数据结果
 *
 * 注意事项：
 * return后面的返回值，必须喝方法名前面的返回值类型保持对应
 */
public class Dome2Method {
    public static String newStringMethod(){
        String name = "小天";
        return name;
    }

    public static int sumNum(){
        int a = 5;
        int b = 6;
        return a+b;
    }

    public static String wether(String weekDay, String dayWether){
        String res = "今天是" + weekDay + ",今天天气是" + dayWether;
        return res;
    }

    public static void printMethod(String strRes){
        System.out.println(strRes);
    }

    public static void main(String[] args) {
        String newName = newStringMethod();
        System.out.println(newName);

        int resNum = sumNum();
        System.out.println(resNum);

        String res = wether("星期三","晴天");
        System.out.println(res);

        printMethod("我喜欢蓝天白云");
    }
}
