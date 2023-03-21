package com.api.StringTest;
/**
 * 定义一个发放，把数组(1,2,3)按照指定格式拼接成一个字符串，格式参照如下[word#word#word]
 * 
 * 分析
 * 1.定义一个数组int[]，内容是1,2,3
 * 2.定义一个方法，用来将数组变成字符串
 * 三要素
 * 返回类型String
 * 发放名称
 * 参数列表，int[]
 * 
 * 3.格式：[word#word#word]
 * 用到for循环，字符串拼接，每个数组元素之前都有一个word字样，分割用#，区分一下是否是最后一个
 * 4.调用方法，得到返回值，并打印结果
 */

 public class Dome7StringPractise{
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array){
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                 str += "word" + array[i] + "]";
                 System.out.println(str);
            }else{
                 str += "word" + array[i] + "#";
                 System.out.println(str);
            }
        }
        str = "[" + str;
        return str;
    }
 }