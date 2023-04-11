package newCom.testDome.Dome5多态;

public class JianJiaoChicken extends Chicken{
    public JianJiaoChicken() {
    }

    public JianJiaoChicken(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+",我不吃东西");
    }

    public void song(){
        System.out.println("唧唧复唧唧，我是尖叫鸡");
    }
}
