package com.test.abstractTest.Dome1;

import java.util.ArrayList;


//群主类
public class Manager extends User{
    public Manager(){

    }

    public Manager(String name ,int money){
        super(name,money);
    }

    public ArrayList<Integer> send(int totalMoney , int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看下群主又多少钱
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        //扣钱，重新设置余额
        super.setMoney(leftMoney-totalMoney);

        //发红包需要平均拆分count份
        int avg = totalMoney/count;
        int mod = totalMoney % count;//余数，也就是甩下的零头

        //剩下的零头，包在最后一个红包当中

        //把红包一个一个放到集合当中
        // for (int i = 0 ;i < count-1 ;i++){
        //     redList.add(avg);
        // }
        // int last = avg + mod;
        // redList.add(last);

        for (int i = 0 ; i<count ;i++){
            if (i==count-1){
                redList.add(avg + mod);
            }else{
                redList.add(avg);
            }
        }

        return redList;
    }
}
