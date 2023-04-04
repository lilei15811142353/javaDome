package newCom.testDome.Dome1;

import java.util.Arrays;

//按单价排序输出的化妆品管理类
public class SortCosmticManager extends CosmeticManager{
    public void printInfo() {
        Cosmetic[] temp = Arrays.copyOf(cs, count);
        Cosmetic c = null;
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - i - 1; j++) {
                if (temp[j].getPrice() > temp[j + 1].getPrice())
                    c = temp[j];
                temp[j] = temp[j + 1];
                temp[j + 1] = c;
            }
        }
        for(Cosmetic cosmetic: temp){
            System.out.println(cosmetic.getInfo());
        }
    }
}
