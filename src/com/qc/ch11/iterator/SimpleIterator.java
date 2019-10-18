package com.qc.ch11.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.iterator
 * @ClassName: SimpleIterator
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 下午2:56
 * @Version: 1.0
 */
public class SimpleIterator {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>(Arrays.asList("he","llo","world","!"));
        Iterator<String>stringIterator=stringList.iterator();
        while(stringIterator.hasNext()){
            String str=stringIterator.next();
            System.out.print(str+" ");
        }
        while (stringIterator.hasNext()){
            stringIterator.next();
            stringIterator.remove();
        }
        System.out.println(stringList);
    }
}
