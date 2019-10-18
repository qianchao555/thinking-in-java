package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: DotNew
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午1:52
 * @Version: 1.0
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew=new DotNew();
        DotNew.Inner di= dotNew.new Inner();
        System.out.println(di);
    }
}

