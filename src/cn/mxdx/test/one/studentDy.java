package cn.mxdx.test.one;

public class studentDy {
    public static void main(String[] args) {
        student stu = new student();

        stu.setName("天天");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名是：" + stu.getName());
        System.out.println("年龄是：" + stu.getAge());
        System.out.println("是不是男人：" + stu.isMale());
    }
}
