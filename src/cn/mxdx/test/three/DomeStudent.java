package cn.mxdx.test.three;

public class DomeStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("小天",20);
        System.out.println("姓名:" + stu2.getName() + ",年龄：" + stu2.getAge());

        //如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXXX方法

        stu2.setAge(30);
        System.out.println("姓名:" + stu2.getName() + ",年龄：" + stu2.getAge());
    }
}
