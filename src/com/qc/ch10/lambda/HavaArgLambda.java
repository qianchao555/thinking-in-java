package com.qc.ch10.lambda;

import java.util.*;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.lamda
 * @ClassName: HavaArgLamda
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 下午3:09
 * @Version: 1.0
 */
public class HavaArgLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("i", "love", "you");
        Collections.sort(list, (s1, s2) -> {
            if (s1 == null) {
                return -1;
            }
            if(s2==null){
                return 1;
            }
            return s1.length()-s2.length();
        });
        System.out.println(list);
    }
}
