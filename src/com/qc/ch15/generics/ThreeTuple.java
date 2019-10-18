package com.qc.ch15.generics;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: ThreeTuple
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午8:54
 * @Version: 1.0
 */
public class ThreeTuple<T, T1, T2> extends TwoTuple<T,T1>{
    public final T2 third;
    public ThreeTuple(T t,T1 t1,T2 t2){
        super(t,t1);
        third=t2;
    }

    @Override
    public String toString() {
        return "("+first+","+second+","+third+")";
    }
}
