package newCom.testDome.Dome5多态;

public class MainDome {
    public static void main(String[] args) {
        HomeChicken hc = new HomeChicken("家鸡");
        hc.eat();

        YeChicken yc = new YeChicken("野鸡");
        yc.eat();

        //用父类的引用指向子类对象，(用大的类型来表示小的类型)，自动转化(向上转型)
        Chicken chH = new HomeChicken("家鸡-");
        chH.eat();
        Chicken chY = new YeChicken("野鸡-");
        chY.eat();

        chH = chY;
        chH.eat();

        Chicken chickenHome = new HomeChicken("家鸡-");
        Chicken chickenYe = new YeChicken("野鸡-");

        eat(chickenHome);
        eat(chickenYe);

        Chicken jjcOne = new JianJiaoChicken("尖叫鸡");
        eat(jjcOne);
    }


    //抽象写法(粒度)    面向抽象编程(面向接口编程)
    public static void eat(Chicken c){
        System.out.println("鸡吃饭");
        c.eat();

        //当我们需要把父类的实例强制转换为子类引用时，为了避免类型转换异常，那么我们需要在转换之前做类型检查(判断)
        //成立的条件：对象本身及对象的父类型都可以通过检查
        if (c instanceof JianJiaoChicken){
            //da的类型转换为小的类型，强制转换(向下转型)
            JianJiaoChicken jjc = (JianJiaoChicken) c;
            jjc.song();
        }

    }
}
