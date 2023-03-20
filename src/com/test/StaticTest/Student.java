package com.test.StaticTest;

public class Student {

    private int id;
    private String name;
    private int age;
    static String room; 
    private static int idCounter = 1;//学号计数器，每当new了一个新的对象的时候，计数器++

    public Student(){
        this.id = idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
