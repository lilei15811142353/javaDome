package newCom.testDome.Dome5多态;

public class HomeChicken extends Chicken{
    public HomeChicken() {
    }

    public HomeChicken(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+",我爱吃米");
    }
}
