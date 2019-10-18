package com.qc.interfacedemo.exercise;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.interfacedemo.exercise
 * @ClassName: Ch13
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 上午9:03
 * @Version: 1.0
 */
public class Ch13 {
    public static void main(String[] args) {
        new Test().f();
    }
}

interface InterFace1 {
    void f();
}

interface InterFace2 extends InterFace1 {
}

interface InterFace3 extends InterFace1 {
}

interface InterFace4 extends InterFace2, InterFace3 {
}

class Test implements InterFace4 {
    @Override
    public void f() {
        System.out.println("this is f()");
    }
}
