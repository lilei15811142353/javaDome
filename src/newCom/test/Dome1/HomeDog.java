package newCom.test.Dome1;

class HomeDog extends Dog {
    private int age;

    public HomeDog(String name, String sex, int age) {
        super(name, sex);
        this.age = age;
        System.out.println("子类构造方法执行");
    }

    public void print() {
        System.out.println("哈哈哈哈哈");
    }
    public void eat(){
        System.out.println("子类吃饭");
    }
}
