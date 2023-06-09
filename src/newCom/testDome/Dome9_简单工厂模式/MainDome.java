package newCom.testDome.Dome9_简单工厂模式;

public class MainDome {
    public static void main(String[] args) {
        //使用者和被使用者两则之间，耦合，产生了依赖，当被使用者改变时，会影响使用者
        //适用工厂模式来降低两者之间的依赖
//        Product phone = new Phone();
        Product phone = ProductFactory.getProduct("phone1");
        if (null != phone){
            phone.work();
        }else {
            System.out.println("返回空");
        }
    }
}
