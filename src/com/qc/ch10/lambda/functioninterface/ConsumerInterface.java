package com.qc.ch10.lambda.functioninterface;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.lambda.functioninterface
 * @ClassName: ConsumerInterface
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 下午3:35
 * @Version: 1.0
 */

@FunctionalInterface//保证接口的正确性
public interface ConsumerInterface <T>{
    T accept(T t);
    default void f(){
        System.out.println("my ConsumerInterface f()");
    }
}
