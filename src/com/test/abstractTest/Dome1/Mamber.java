package com.test.abstractTest.Dome1;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Mamber extends User{
    public Mamber(){

    }

    public Mamber(String name ,int count){
        super(name,count);
    }

    public void receiver(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //从集合当中删除，并且得到被删除的红包给我自己
        Integer delta = list.remove(index);

        //当前成员有多少钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
