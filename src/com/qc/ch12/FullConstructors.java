package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: FullConstructors
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 下午4:51
 * @Version: 1.0
 */
public class FullConstructors {
    public static void f()throws MyException{
        System.out.println("throwing MyException from f()");
        throw new MyException();
    }
    public static void g()throws MyException{
        System.out.println("throwing MyException from g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
class MyException extends Exception{
    public MyException(){}
    public MyException(String str){
        super(str);
    }
}
