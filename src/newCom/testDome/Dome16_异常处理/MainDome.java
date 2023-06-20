package newCom.testDome.Dome16_异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDome {
    public static void main(String[] args) {
        // div(10, 0);
        // method();
        try{
            int num3 = div2(20, 0);
            System.out.println("结果是="+num3);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("over");
        // input();
    }

    private static void div(int num1, int num2){
        int[] array = {1,2,3,4,5};
        try{
            System.out.println(array[4]);
            array = null;
            System.out.println(array.length);
            int result = num1/num2;
            System.out.println("结果是：" + result);
        }catch(ArithmeticException e){
            System.out.println("除数不能为零");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组超界");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }catch(Exception e){
            System.out.println("系统异常");
        }finally{//最终 
            System.out.println("程序执行完成");
        }
    }

    private static int method(){
        int a = 10;
        int b = 2;
        try{
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            int c = a/b;
            System.out.println("a/b=" + c);
            return c;
        }catch(Exception e){
            //代码调试时使用
            e.printStackTrace();
        }finally{
            System.out.println("finally.");
        }
        return -1;
    }

    private static int div2(int a, int b)throws Exception{
        try{
            int c = a/b;
            return c;
        }catch(Exception e){
            throw new Exception("除数不能为0");
        }finally{
            System.out.println("程序结束");
        }
    }
    private static void input(){
        Scanner input = new Scanner(System.in);
        try{
            int num = input.nextInt();
            System.out.println(num);
        }catch(InputMismatchException exception){
            System.out.println("输入不匹配");
        }

    }
}
