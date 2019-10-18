package com.qc.ch15.generics.fib;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics.fib
 * @ClassName: Generator
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午9:49
 * @Version: 1.0
 */
public interface Generator<T> {
    /**
     * 生成泛型对象
     * @return
     */
    T next();
}
