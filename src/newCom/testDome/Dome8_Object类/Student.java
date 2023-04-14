package newCom.testDome.Dome8_Object类;

public class Student {
    private String name;
    private  int sid;
    private  int age;

    public Student() {
    }

    public Student(String name, int sid, int age) {
        this.name = name;
        this.sid = sid;
        this.age = age;
    }

    //重写Object中的toString方法
    public String toString(){
        return "sid=" + sid +  ",name=" + name +",age=" + age;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        };
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (!this.name.equals(s.name)){
                return false;
            }
            if (this.sid != s.sid){
                return false;
            }
            if (this.age != s.age){
                return false;
            }
            return true;
        }
        return false;
    }
}
