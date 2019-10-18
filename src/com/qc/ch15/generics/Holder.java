package com.qc.ch15.generics;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: Holder
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午8:25
 * @Version: 1.0
 */
public class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    private void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder<Automobile> holder=new Holder<Automobile>(new Automobile());
        Automobile auto=holder.get();
        System.out.println(auto);
    }

}
