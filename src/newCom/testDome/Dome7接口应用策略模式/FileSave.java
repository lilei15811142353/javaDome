package newCom.testDome.Dome7接口应用策略模式;

public class FileSave implements ISave{
    public void save(String data){
        System.out.println("把数据保存到文件中... " + data);
    }
}
