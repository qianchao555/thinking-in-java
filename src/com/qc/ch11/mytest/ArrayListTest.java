package com.qc.ch11.mytest;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.mytest
 * @ClassName: ArrayListTest
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 上午11:46
 * @Version: 1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>(3);
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("1");
        //动态数组,会自动扩容,每次扩容1.5倍
        arrayList.add("1");
        System.out.println(arrayList.size());
        List<Integer>integerList= Arrays.asList(12,14,12,14,15);
        //此时底层为数组,不能动态修改大小
//        integerList.add(55);
//        System.out.println(integerList);

    }
}
