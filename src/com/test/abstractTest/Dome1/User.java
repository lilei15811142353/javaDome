package com.test.abstractTest.Dome1;

public class User {
    private String name ;
    private int money;

    public User(){

    }

    public User(String neme, int money) {
        this.name = neme;
        this.money = money;
    }

    public void show(){
        System.out.println("我叫" + name + ",我有多少钱" + money);
    }

    public String getNeme() {
        return name;
    }

    public void setNeme(String neme) {
        this.name = neme;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
