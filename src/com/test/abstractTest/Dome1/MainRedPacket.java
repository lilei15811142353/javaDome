package com.test.abstractTest.Dome1;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Mamber one = new Mamber("成员A",0);
        Mamber two = new Mamber("成员B",0);
        Mamber three = new Mamber("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("================");

        ArrayList<Integer> redList = manager.send(20, 3);
        //三个普通成员收红包
        one.receiver(redList);
        two.receiver(redList);
        three.receiver(redList);


        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
