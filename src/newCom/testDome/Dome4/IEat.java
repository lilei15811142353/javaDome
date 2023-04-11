package newCom.testDome.Dome4;

public interface IEat {
    public abstract void eat();
    public static final int NUM = 10;

    //jdk1.8新特性，可以被所有实现类继承
    public default void printEat(){
        System.out.println("eat");
    }
}
