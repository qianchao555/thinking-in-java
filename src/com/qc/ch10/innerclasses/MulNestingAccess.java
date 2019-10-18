package com.qc.ch10.innerclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: MulNestingAccess
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 上午9:40
 * @Version: 1.0
 */
public class MulNestingAccess {
    public static void main(String[] args) {
        MNA mna=new MNA();
        MNA.A mnaa=mna.new A();
        MNA.A.B mnaab=mnaa.new B();
        mnaab.h();
    }

}
class  MNA{
    private void f(){
        System.out.println("ffff");
    }
    class A{
        private void g(){}
        class B{
            void h(){
                //!!!可以直接访问外部类的私有成员！！！！
                f();
                g();
            }
        }
    }
List list=new ArrayList();
}
