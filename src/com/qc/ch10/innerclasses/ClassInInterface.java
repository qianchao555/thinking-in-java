package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: ClassInInterface
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 上午8:36
 * @Version: 1.0
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
