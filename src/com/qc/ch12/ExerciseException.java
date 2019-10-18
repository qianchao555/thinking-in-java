package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: ExerciseException
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午10:56
 * @Version: 1.0
 */
public class ExerciseException {
    public static void main(String[] args) {
       A a=new C();
        try {
            a.f();
        } catch (A e) {
            e.printStackTrace();
        }
    }

}

class A extends Exception{
    public void f()throws A{}
}
class B extends A{
    @Override
    public void f() throws B {
        throw new B();
    }
}
class C extends B{
    @Override
    public void f() throws C {
      throw new C();
    }
}
