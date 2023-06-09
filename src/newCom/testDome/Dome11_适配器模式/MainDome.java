package newCom.testDome.Dome11_适配器模式;

public class MainDome {
    public static void main(String[] args) {
        PowerA powerA = new PowerAImp();
        work(powerA);
        PowerB powerB = new PowerBImpl();
//        work(powerB);

        Adapter adapter = new Adapter(powerB);
        work(adapter);
    }

    public static void work(PowerA a){
        System.out.println("正在连接。。。");
        a.insert();
        System.out.println("工作结束");
    }
}
