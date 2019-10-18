package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: InheritingExceptions
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 下午4:47
 * @Version: 1.0
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed=new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.err.println("Caught it!");
        }
    }
}
class SimpleException extends Exception{}
