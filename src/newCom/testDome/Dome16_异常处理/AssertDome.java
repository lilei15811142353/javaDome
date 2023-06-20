package newCom.testDome.Dome16_异常处理;

public class AssertDome {
    public static void main(String[] args) {
        int result = add(10,10);
        assert result == 10:"结果错误";

    }
    private static int add(int a,int b ){
        return a+b;
    }
}
