package newCom.testDome.Dome13_递归算法;

public class MainDome {
    public static void main(String[] args) {
        int result = jiecheng1(10);
        System.out.println(result);

        int result2 = jiecheng2(10);
        System.out.println(result2);
    }

    public static int jiecheng1(int num){
        int result = num;
        int i = num-1;
        do{
            result = result*i;
            i--;
        }while (i>1);

        return result;
    }

    //递归算法：方法本身调用自己
    //递归必须要有出口
    //递归内存消耗大，容易发生内存溢出
    public static int jiecheng2(int num){
        if(num==1)return 1;
        return num*jiecheng2(num-1);
    }
}
