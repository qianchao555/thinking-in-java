package com.qc.ch10.innerclasses.anonymous;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses.anonymous
 * @ClassName: ClassDemo
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午3:27
 * @Version: 1.0
 */
public class ClassDemo {
    public static void main(String[] args) {
        Man man = new Man() {
            @Override
            public void eat() {
              //  super.eat();
                System.out.println("anonymous eat()");
            }
        };
        man.eat();
    }
}

class Man {
    public void eat() {
        System.out.println("Man eat()");
    }
}
