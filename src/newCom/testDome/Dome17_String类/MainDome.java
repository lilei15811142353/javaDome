package newCom.testDome.Dome17_String类;

/**
 * String表示一个字符串，内部使用字符数组实现，不能被继承(最终类),不可变
 */
public class MainDome {
    public static void main(String[] args) {
        //String的两种赋值方式,JAVA推荐使用第一种赋值方式
        String s1 = "花花";//存放到常量池中

        //使用New关键字创建对象，new：表示申请内存空间
        String s2 = new String("花花");//存放在堆内存中
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "花花";

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("------------------------");

        //代码示例。4中情况分析:直接赋值字符串连接时，考虑编译期和运行期
        //如果在编译期值可以被确定，那么就使用已有的对象，否则会创建新的对象
        String a = "a";
        String a1 = a + 1;
        String a2 = "a1";
        System.out.println(a1 == a2);

        final String b = "b";
        String b1 = b+1;
        String b2 = "b1";
        System.out.println(b1 == b2);

        System.out.println("-----------------------");
        String c = getStringC();
        String c1 = c+1;
        String c2 = "c1";
        System.out.println(c1 == c2);

        final String d = getStringD();
        String d1 = d+1;
        String d2 = "d1";
        System.out.println(d1 == d2);
    }
    private static String getStringC(){
        return "c";
    }

    private static String getStringD(){
        return "c";
    }
}
