package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: AlwaysFinally
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午9:42
 * @Version: 1.0
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("entering first try block.");
        try {
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2nd try block.");
            }
        } catch (FourException e) {
            System.out.println("caught FourException in 1st try block.");
        } finally {
            System.out.println("finally in 1st try block.");
        }
    }
}

class FourException extends Exception {
}
