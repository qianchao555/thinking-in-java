package com.qc.ch15.generics;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: GenericMethod
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午10:21
 * @Version: 1.0
 */
public class GenericMethod {
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        gm.f(1);
        gm.f("str");
        gm.f('c');
    }
}
