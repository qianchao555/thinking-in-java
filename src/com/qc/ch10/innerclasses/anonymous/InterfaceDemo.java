package com.qc.ch10.innerclasses.anonymous;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses.anonymous
 * @ClassName: Demo
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午3:24
 * @Version: 1.0
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Person p=new Person() {
            @Override
            public void eat() {
                System.out.println("eat meat");
            }
        };
        p.eat();
    }

}
interface Person{
    void eat();
}
