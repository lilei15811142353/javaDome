package cn.mxdx.test.one;

/**
 * 对于基本类型中的布尔型，对于getter方法，一定要使用isXXX，setter方法不变
 */
public class student {

    private String name;
    private int age;

    private boolean male;//是不是男人

    public void setName(String str){
        name = str;
    }

    public String  getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }
}
