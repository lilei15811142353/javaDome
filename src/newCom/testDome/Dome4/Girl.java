package newCom.testDome.Dome4;

//具体类实现接口必须实现接口的所有方法
public class Girl implements ISleep{
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    @Override
    public void run() {
        System.out.println("跑步");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void eat(){
        System.out.println("我是" + name + ",我爱吃美食");
    }
}
