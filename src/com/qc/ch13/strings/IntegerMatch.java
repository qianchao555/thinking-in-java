package com.qc.ch13.strings;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch13.strings
 * @ClassName: IntegerMatch
 * @Author: android2
 * @Description:
 * @Date: 2019/10/28 上午8:28
 * @Version: 1.0
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("567".matches("-?\\d+"));
        System.out.println("+567".matches("-?\\d+"));
        System.out.println("+567".matches("(-|\\+)?\\d+"));
    }
}
