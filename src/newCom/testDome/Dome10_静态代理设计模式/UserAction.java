package newCom.testDome.Dome10_静态代理设计模式;

public class UserAction implements Action{
    public void doAction(){
        for (int i=0;i<100;i++) {
            System.out.println("用户开始工作");
        }
    }
}
