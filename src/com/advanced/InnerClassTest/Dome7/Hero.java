package com.advanced.InnerClassTest.Dome7;

public class Hero {

    private String name;//英雄名称
    private Skill skill;//英雄技能

    public Hero() {
    }

    public void attack(){
        System.out.println("我叫" + name + ",开始释放技能");
        skill.use();
        System.out.println("释放技能完成。");
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
