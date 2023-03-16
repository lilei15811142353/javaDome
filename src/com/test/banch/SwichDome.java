package com.test.banch;

public class SwichDome {
    public static void main(String[] args) {
        String weekDay = "周8";
        switch (weekDay){
            case "周一":
                System.out.println("今天是周一");
                break;
            case "周二":
                System.out.println("今天是周二");
                break;
            case "周三":
                System.out.println("今天是周三");
                break;
            default:
                System.out.println("今天是----" + weekDay);
        }
    }
}
