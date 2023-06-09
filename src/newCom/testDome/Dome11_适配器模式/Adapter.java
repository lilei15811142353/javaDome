package newCom.testDome.Dome11_适配器模式;

//适配器
public class Adapter implements PowerA{
    private PowerB powerB;

    public Adapter(PowerB powerB){
        this.powerB = powerB;
    }

    public void insert(){
        powerB.connect();
    }
}
