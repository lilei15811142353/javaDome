package com.test.day2.Array;

/**
 * 遍历数组
 */
public class Dome8 {
    public static void main(String[] args) {
//        traversalArray();
//        maxArray();
//        reverse();

//        int[] array = new int[]{11,22,33,44};
//        arrayParam(array);

        int[] result = returnArray(3,4,5);
        System.out.println("总和：" +result[0]);
        System.out.println("平均数：" +result[1]);
    }


    //遍历数组
    public static void traversalArray(){
        int[] array = new int[]{15,14,22,33};

        for (int i = 0 ;i<array.length ; i++){
            System.out.println(array[i]);
        }
    }

    //找出数组中的最大值
    public static void maxArray(){
        int[] array = new int[]{11,22,33,44};

        int max = array[0];
        for (int i = 1; i<array.length ;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值:" + max);
    }

    /**
     * 数组元素的反转
     */
    public static void reverse(){
        int[] array = new int[]{22,11,33,40};
        for (int min = 0 , max = array.length-1;min<max; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void arrayParam(int[] array){
        for (int i = 0 ; i<array.length;i++){
            System.out.println("这是数组第" + (i+1) + "个元素：" + array[i]);
        }
    }

    public static int[] returnArray(int a ,int b,int c){
        int sum = a+b+c;
        int agv = (a+b+c)/3;

        int[] array = {sum,agv};

        return array;
    }

}
