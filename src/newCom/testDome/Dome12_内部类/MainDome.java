package newCom.testDome.Dome12_内部类;

public class MainDome {
    public static void main(String[] args) {
        Outer outer = new Outer();

        //在外部创建成员内部类的实例，因为成员内部类需要依赖外部类的对象
        //通常情况下。我们不建议这样来实例化内部类的对象

//        Outer.Inner inner = outer.new Inner(); //私有化了。不能外部调用
//        inner.print();

        outer.innerPrint();
        outer.show();

        Outer.Inner3 inner3 = new Outer.Inner3();
        inner3.print();

        outer.print1();

        outer.print2();


        //参数式匿名内部类
        outer.print3(new Eat(){
            public void eat(){
                System.out.println("参数式匿名内部类");
            }
        });
    }
}
