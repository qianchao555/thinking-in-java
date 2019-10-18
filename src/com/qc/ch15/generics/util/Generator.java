package com.qc.ch15.generics.util;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics.util
 * @ClassName: Generator
 * @Author: android2
 * @Description:
 * @Date: 2019/10/18 上午11:50
 * @Version: 1.0
 */
public interface Generator <T>{
    /**
     * 一般一个生成器只定义一个方法,该方法用以产生新的对象
     * @return
     */
    T next();
}
