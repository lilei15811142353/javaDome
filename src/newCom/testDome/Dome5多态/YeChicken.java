package newCom.testDome.Dome5多态;

public class YeChicken extends Chicken{
    public YeChicken() {
    }

    public YeChicken(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+",我爱吃虫子");
    }
}
