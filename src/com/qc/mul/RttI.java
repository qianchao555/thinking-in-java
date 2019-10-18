package com.qc.mul;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.mul
 * @ClassName: RTTI
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 下午4:14
 * @Version: 1.0
 */
public class RttI {
    public static void main(String[] args) {
        Useful[] useful = {
                new Useful(),
                new MoreUseful()
        };
        useful[0].f();
        useful[1].g();
        //向下转型


        ((MoreUseful) useful[1]).k();
    }
}

class Useful {
    public void f() {
        System.out.println("this father f()");
    }

    public void g() {
        System.out.println("this father g()");
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
        System.out.println("this sub f()");
    }

    @Override
    public void g() {
        System.out.println("this sub g()");
    }

    public void k() {
        System.out.println("this sub K()");
    }

}
