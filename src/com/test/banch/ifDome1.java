package com.test.banch;

public class ifDome1 {
    public static void main(String[] args) {
        int heartBeat = 80;
        if(heartBeat<60 || heartBeat>100){
            System.out.println("您的心跳数据是" + heartBeat + "，您可能需要进一步检查");
        }
        System.out.println("检查结束");

        double money = 559.33;
        if (money>1314){
            System.out.println("您当前发送红包成功");
        }else {
            System.out.println("余额都不够了，还发");
        }

        int souce = 111;

        if (souce>=90 && souce<=100){
            System.out.println("您的评分为优秀");
        }else if (souce >= 60 && souce <90){
            System.out.println("您的评分为良好");
        }else if (souce<60){
            System.out.println("您的分都不及格了。好好学吧");
        }else {
            System.out.println("请检查您录入的分值是否正确");
        }
    }
}
