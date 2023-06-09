package newCom.testDome.Dome12_内部类;

public class Outer {
    private String name;

    public void innerPrint(){
        Inner inner = new Inner();
        inner.print();
    }
    private class Inner{
        public void print(){
            System.out.println("Inner");
        }
    }
}
