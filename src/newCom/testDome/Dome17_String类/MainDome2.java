package newCom.testDome.Dome17_String类;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MainDome2 {
    public static void main(String[] args) {
        String str = "idjwid23232";
        char c = str.charAt(3);
        System.out.println(c);

        System.out.println(str.toCharArray());

        char[] cs = {'a','b','c','d'};
        String s1 = new String(cs);
        System.out.println(s1);

        String s2 = new String(cs,0,2);
        System.out.println(s2);

        System.out.println(Arrays.toString(str.getBytes()));

        byte[] by = new byte[5];
        by[0] = 105;
        by[1] = 101;
        by[2] = 119;
        by[3] = 114;
        by[4] = 108;
        String newby = new String(by);
        System.out.println(newby);

        System.out.println(new String(by,0,2));
        try {
            System.out.println(new String(by,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------");
        String fileName = "0us1e2r3r4.txt";
        System.out.println(fileName.endsWith("txt"));


        System.out.println("-----------------------");
        System.out.println( fileName.replace("t","n"));
        System.out.println(fileName.replace("se","ww"));
        System.out.println(fileName.replaceAll("[0-9]","*"));
        System.out.println(fileName.replaceAll("\\d","*"));



        System.out.println("-----------------------");
        String subStringStr = "qwertytui";
        System.out.println(subStringStr.substring(2));
        System.out.println(subStringStr.substring(2,4));


        System.out.println("-----------------------");
        System.out.println(Arrays.toString(subStringStr.split("t")));
        System.out.println(Arrays.toString(subStringStr.split("t",2)));

        System.out.println("-----------------------");

    }
}
