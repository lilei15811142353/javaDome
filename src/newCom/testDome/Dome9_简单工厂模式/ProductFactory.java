package newCom.testDome.Dome9_简单工厂模式;

public class ProductFactory {
    public static Product getProduct(String name){
        if ("phone".equals(name)){
            return new Phone();
        }else {
            return null;
        }
    }
}
