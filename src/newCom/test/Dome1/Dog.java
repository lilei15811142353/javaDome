package newCom.test.Dome1;

public class Dog {
    private   String name;
    private String sex;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("父类构造方法执行");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}


