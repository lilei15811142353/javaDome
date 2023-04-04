package newCom.testDome.Dome1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CosmeticManager {
    protected Cosmetic[] cs = new Cosmetic[4];
    protected int count = 0;

    //进货功能
    public void add(Cosmetic c){
        int size = cs.length;
        if (count>=size){
            int newLen = size*2;
            cs = Arrays.copyOf(cs,newLen);
        }
        cs[count] = c;
        count++;
    }
}
