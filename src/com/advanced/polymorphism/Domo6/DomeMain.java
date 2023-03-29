package com.advanced.polymorphism.Domo6;

public class DomeMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        // Mouse mouse = new Mouse();
        //向上转型
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();
        //方法参数是USB类型，传递进去的是实现对象
        computer.useDevice(keyboard);//也发生了向上转型
        computer.useDevice(new Keyboard());

        computer.powerOff();

        System.out.println("==============");
        method(10.0);
        method(10);
    }

    public static void method(double num){
        System.out.println(num);
    }
    
}
