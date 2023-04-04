package newCom.test.Dome2;

import java.util.Arrays;

public class Zi extends Fu{

    public void printInfo(){
        Dome[] newdm = Arrays.copyOf(dm,count);
        for(Dome dm: newdm){
            System.out.println(dm.printDome());
        }
    }

}
