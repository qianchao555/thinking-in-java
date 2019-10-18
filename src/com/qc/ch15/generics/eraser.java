package com.qc.ch15.generics;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: eraser
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午11:52
 * @Version: 1.0
 */
public class eraser {
    /**
     * 泛型代码内部,无法获得任何有关泛型参数类型的信息  !!!
     */
    @Test
    public void  f(){
        Class c=new ArrayList<Integer>().getClass();
        System.out.println(c);
        Class c1=new ArrayList<String>().getClass();
        System.out.println(c1);
    }
}
