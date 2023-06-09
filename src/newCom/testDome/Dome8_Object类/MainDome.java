package newCom.testDome.Dome8_Object类;

public class MainDome {
    public static void main(String[] args) {
        Student stu1 = new Student("小红",2,18);

        //toString是否写都一样
        System.out.println(stu1.toString());
        System.out.println(stu1);

        Student stu2 = new Student("小红",2,18);
        System.out.println(stu1.equals(stu2));

        String str1 = new String("贝贝");
        String str2 = new String("贝贝");
        System.out.println(str2 == str1);
        System.out.println(str1.equals(str2));

        System.out.println(stu1.getClass() == stu2.getClass());


        System.out.println("hello");
    }
}
