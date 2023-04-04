package com.advanced.InnerClassTest.Dome7;

import com.advanced.InnerClassTest.Dome7.Hero;

public class MainDome {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

        //还可以改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("ooooooooooo");
//            }
//        };
//        hero.setSkill(skill);

        //进一步简化
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("UUUUUUUUUU");
            }
        });

        hero.attack();
    }
}
