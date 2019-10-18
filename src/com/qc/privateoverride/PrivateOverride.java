package com.qc.privateoverride;

import java.util.HashMap;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.privateoverride
 * @ClassName: PrivateOverride
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 上午10:13
 * @Version: 1.0
 */
public class PrivateOverride {
    /**
     * 隐式final修饰
     */
    private void f() {
        System.out.println("private f()");
    }
    HashMap hashMap=new HashMap();

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    /**
     * 相当于一个全新的方法
     */
    public void f() {
        System.out.println("public f()");
    }
}
