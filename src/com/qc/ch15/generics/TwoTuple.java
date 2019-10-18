package com.qc.ch15.generics;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: TwoTuple
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午8:46
 * @Version: 1.0
 */
public class TwoTuple<T, T1> {
    public final T first;
    public final T1 second;

    public TwoTuple(T t, T1 t1) {
        first = t;
        second = t1;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }


}
