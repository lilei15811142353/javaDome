package newCom.testDome.Dome10_静态代理设计模式;

public class MainDome {
    public static void main(String[] args) {
        Action userAction = new UserAction();
        ActionProxy proxy = new ActionProxy(userAction);

        proxy.doAction();
    }
}
