package cn.mxdx.test;

/**
 * 封装：
 * 1.方法就是一种封装
 * 2.关键字private也是一种封装
 *
 * 封装就是将一些细节信息隐藏起来，对于外接不可见
 */
public class Dome1MethodFZ {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int max = array[0];
        for (int i = 1;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(getMax(array));
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
