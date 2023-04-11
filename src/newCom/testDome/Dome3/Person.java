package newCom.testDome.Dome3;

abstract class Person extends Animal{
    public abstract void eat();

    //抽象类可以有抽象方法
    public void sleep(){
        System.out.println("睡觉");
    }
}
