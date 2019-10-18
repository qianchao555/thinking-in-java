package com.qc.ch11.map;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.map
 * @ClassName: MyPet
 * @Author: android2
 * @Description:
 * @Date: 2019/10/18 上午8:50
 * @Version: 1.0
 */
public class MyPet {
    public MyPet(){
        System.out.println("this is my pet.");
    }
}
class Cat extends MyPet{
    public Cat(){
        System.out.println("this is my cat.");
    }
}

class Dog extends MyPet{
    public Dog(){
        System.out.println("this is my dog.");
    }
}
