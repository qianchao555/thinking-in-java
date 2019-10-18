package com.qc.ch10.exercise;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.exercise
 * @ClassName: TwentyOne
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 上午8:51
 * @Version: 1.0
 */
public interface TwentyOne {
    void method();

     class Test implements TwentyOne {
        @Override
        public void method() {
            System.out.println("hello.");
        }

        public static void f() {
            new Test().method();
        }

        public static void main(String[] args) {
            f();
        }
    }

}
