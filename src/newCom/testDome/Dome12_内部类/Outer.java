package newCom.testDome.Dome12_内部类;

class Outer {
    private String name = "Outer";
    static String weather = "summer";

    //--------成员内部类----------
    public void innerPrint(){
        Inner inner = new Inner();
        inner.print();
    }
    private class Inner{
        public void print(){
            System.out.println("成员内部类" + name);
        }
    }

    //---------方法内部类---------\

    //show方法的局部变量或者方法的参数，实际上必须是常量(final)
    public void show(){
        final int x =10;
        class Inner2{
            public void print2(){

                System.out.println(name+"方法内部类"+x + name);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.print2();
    }

    //---------静态内部类------------

    static class Inner3{
        //无法从静态上下文中引用非静态变量
        public void print(){
            System.out.println("静态内部类" + weather);
        }
    }

    //-----------匿名内部类-----------`

    //&&&&&&&&&继承式&&&&&&&&&&&
    public  void print1(){
        Cat cat = new Cat() {

            public void eat() {
                System.out.println("cat:继承式匿名内部类");
            }
        };
        cat.eat();
    }

    //&&&&&&&&&接口式&&&&&&&&&&&
    public  void print2(){
        Eat eat = new Eat() {
            public void eat() {
                System.out.println("Eat:接口式式匿名内部类");
            }
        };
        eat.eat();
    }

    //&&&&&&&&&参数式&&&&&&&&&&&
    public  void print3(Eat eat){
        eat.eat();
    }
}

