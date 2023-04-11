package newCom.testDome.Dome5多态;

abstract class Chicken {
    private String name;

    public Chicken() {
    }

    public Chicken(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract  void  eat();
}
