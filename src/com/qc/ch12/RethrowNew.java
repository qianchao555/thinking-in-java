package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: RethrowNew
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午8:25
 * @Version: 1.0
 */
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("caught in inner try,e.printStackTrace");
                e.printStackTrace();
                throw new TwoException("from inner try");
            }
        }catch (TwoException e){
            System.out.println("caught outer try,e.printStackTrace");
            e.printStackTrace();
        }
    }
}

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}
