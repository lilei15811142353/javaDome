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

    }
}
