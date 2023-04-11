package newCom.testDome.Dome6抽象类_模板方法;

abstract class BaseManager {
    public void action(String name,String method){
        if ("admin".equals(name)){
            execute(method);
        }else {
            System.out.println("权限不足");
        }
    }

    public  abstract void execute(String method);
}
