package newCom.testDome.Dome7接口应用策略模式;

public class MainDome {
    public static void main(String[] args) {
        BaseService user = new UserService();
        user.setiSave(new NetSave());
        user.add("user");
    }
}
