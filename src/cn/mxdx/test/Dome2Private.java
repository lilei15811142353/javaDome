package cn.mxdx.test;


/**
 * 定义年龄时候，无法组织不合理的数值被设置进来
 *
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 * 一旦使用private进行修饰，纳闷本类当中仍然可以随意访问，但是，超出本类范围之外就不能再访问了
 *间接访问private成员变量，就定义一对而getter/setter方法
 *
 * 必须叫setXXX,和getXXX命名规则
 * 对于getter来说，不能有参数，返回值类型和成员变量对应
 * 对于setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Dome2Private {

    String name;
    private int age;

    public void show(){
        System.out.println("我叫" + name +",今年" + age + "岁了");
    }

    //这个成员方法专门用于向age设置数据，
    public void setAge(int num){
        if (num < 100 && num >=9){
            age = num;
        }else {
            System.out.println("数据不合理");
        }

    }

    //这个成员方法专门获取age的数据
    public int getAge(){
        return age;
    }
}
