package com.qc.interfacedemo;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.interfacedemo
 * @ClassName: Adventure
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 上午8:34
 * @Version: 1.0
 */
public class Adventure {
    public static void t(CanFight canFight) {
        canFight.fight();
    }

    public static void u(CanSwim canSwim) {
        canSwim.swim();
    }

    public static void w(ActionCharacter actionCharacter) {
        actionCharacter.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        //因为hero继承了ActionCharacter,并且实现了CanFight、CanSwim.
        //绑定时自动向上转型为接口或类型.
        t(hero);
        u(hero);
        w(hero);
    }
}

interface CanFight {
    public void fight();
}

interface CanSwim {
    public void swim();
}

class ActionCharacter {
    public void fight() {
        System.out.println("can not fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim {
    @Override
    public void swim() {
        System.out.println("can swim");
    }
//
//    @Override
//    public void fight() {
//        System.out.println("can fight");
//    }
}
