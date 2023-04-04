package newCom.test.Dome2;

public class MainDome {
    public static void main(String[] args) {
        Zi zi = new Zi();
        Dome one = new Dome("小虎",20);
        Dome two = new Dome("小龙",30);
        zi.add(one);
        zi.add(two);
//        zi.printInfo();
    }
}
