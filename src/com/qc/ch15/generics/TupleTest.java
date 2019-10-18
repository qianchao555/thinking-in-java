package com.qc.ch15.generics;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: TupleTest
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午8:44
 * @Version: 1.0
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 12);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "h1", 13);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> tti = f();
        System.out.println(tti);
        System.out.println(tti.first);
        //first为final修饰的
        //tti.first="Str";
        System.out.println(g());
    }
}

class Amphibian {
}

class Vehicle {
}
