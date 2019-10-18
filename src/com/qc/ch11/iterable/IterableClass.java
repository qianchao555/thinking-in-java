package com.qc.ch11.iterable;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.iterable
 * @ClassName: IterableClass
 * @Author: android2
 * @Description:
 * @Date: 2019/10/18 上午10:02
 * @Version: 1.0
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("and that how we know the earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for(String s:new IterableClass()){
            System.out.print(s+" ");
        }

    }
}
