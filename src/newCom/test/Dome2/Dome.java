package newCom.test.Dome2;

public class Dome {
    private String name;
    private int age;

    public Dome() {
    }

    public Dome(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printDome(){
        String msg = "name=" + name + ",age" + age;
        return msg;
    }
}
