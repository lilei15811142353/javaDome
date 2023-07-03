package newCom.testDome.Dome18_StringBuffer;

public class MainDome {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a+b;
        System.out.println(c);

        String d = "a"+1+2+3+4+"b";

        StringBuffer sb = new StringBuffer(43);//带容量的构造，16以下的话不用传参，默认未16
        sb.append(a).append(b).append(d);
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer("今天星期一");
        System.out.println(sb2);
        System.out.println(sb2.delete(0,1));
        System.out.println(sb2.indexOf("星"));
        System.out.println(sb2.insert(1,"红"));
        System.out.println(sb2.replace(3,4,"---"));
        System.out.println(sb2.substring(3,4));
        System.out.println(sb2.reverse());
    }
}
