package newCom.testDome.Dome10_静态代理设计模式;

public class ActionProxy implements Action{
    private Action target;//被代理的对象

    public ActionProxy(Action target){
        this.target = target;
    }
    //执行操作
    public void doAction(){
        long startTime = System.currentTimeMillis();
        target.doAction();//执行真正的业务
        long endTime = System.currentTimeMillis();

        System.out.println("共耗时：" + (endTime-startTime));
    }
}
