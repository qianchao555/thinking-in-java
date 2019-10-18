package com.qc.ch11.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.set
 * @ClassName: SetOperations
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 下午5:12
 * @Version: 1.0
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        Collections.addAll(set1,"a,b,c,d,e".split(","));
        set1.add("l");
        System.out.println(set1.contains("l"));
        Set<String> set2=new HashSet<>();
        Collections.addAll(set2,"a,l,e".split(","));
        System.out.println(set1.containsAll(set2));
        set1.remove("a");
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
