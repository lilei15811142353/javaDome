package cn.mxdx.test;


public class Dome3PrivateDy {
    public static void main(String[] args) {
        Dome2Private dy = new Dome2Private();
        dy.show();

        dy.name = "乔布斯";
//        dy.age= 66; //直接访问private方法是错误的

        dy.show();
        dy.setAge(20);

        dy.show();
    }
}
