package com.qc.ch15.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: GenericVarargs
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午10:41
 * @Version: 1.0
 */
public class GenericVarargs {
    /**
     * 可变参数与泛型方法例
     *
     * @param args
     * @param <T>
     * @return List<T>
     */
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls=makeList("yhc");
        System.out.println(ls);
        ls=makeList("a","b");
        System.out.println(ls);
        ls= Arrays.asList("12","1234");
        System.out.println(ls);
    }
}
