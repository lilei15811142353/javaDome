package newCom.testDome.Dome7接口应用策略模式;

public class NetSave implements ISave{
    public void save(String data){
        System.out.println("把数据保存到网络上..."+data);
    }
}
