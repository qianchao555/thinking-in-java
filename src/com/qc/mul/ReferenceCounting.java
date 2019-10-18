package com.qc.mul;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.mul
 * @ClassName: ReferenceCounting
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 下午2:26
 * @Version: 1.0
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
    }
}

class Shared {
    private static long counter = 1;
    private final long id = ++counter;

    public Shared() {
        //counter++;
        System.out.println("creating " + this);
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}
