package newCom.testDome.Dome6抽象类_模板方法;

public class UserManager extends BaseManager{
    public void execute(String method){
        //用户是否登录的验证
        //验证成功后才可以执行以下操作
        if("add".equals(method)){
            System.out.println("执行了添加操作");
        }else if("del".equals(method)){
            System.out.println("执行了删除操作");
        }
    }
}
