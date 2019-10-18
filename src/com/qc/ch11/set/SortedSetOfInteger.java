package com.qc.ch11.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch11.set
 * @ClassName: SortedSetOfInteger
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 下午2:05
 * @Version: 1.0
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random=new Random(47);
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<10;i++){
            set.add(random.nextInt(500));
        }
        System.out.println(set);
    }
}
