package newCom.testDome.Dome15_基本数据类型包装类;

public class MainDome {
    public static void main(String[] args) {

        //把基本数据类型转换为包装类型
        Integer i1 = new Integer(10);
        //把包装类装换为基本数据类型，成为自动拆箱
        int i2 = i1.intValue();
        System.out.println(i2);

        Integer i3 = 11;//建议方式
        System.out.println(i3);

        Integer i4 = new Integer("123");
        int i5 = i4.intValue();
        System.out.println(i5);

        String num1 = "12";
        int i6 = Integer.parseInt(num1);
        System.out.println(i6);

        int i7 = Integer.valueOf(num1);
        System.out.println(i7);


        // 注意
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));

        Integer x3 = 10;
        Integer x4 = 10;
        System.out.println(x3 == x4);
        System.out.println(x3.equals(x4));

        Integer x5 = 128;
        Integer x6 = 128;
        System.out.println(x5 == x6);
        System.out.println(x5.equals(x6));
    }
}
