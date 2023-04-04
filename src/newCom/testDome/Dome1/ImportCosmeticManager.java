package newCom.testDome.Dome1;

public class ImportCosmeticManager extends CosmeticManager{
    //可输出进口化妆品的管理类
    public void printInfo(){

        //比较两个字符串的值是否相等，不能使用==，使用equals()
        for (int i = 0; i < count; i++) {
            if ("进口".equals(cs[i].getType())){
                System.out.println(cs[i].getInfo());
            }
        }
    }
}
