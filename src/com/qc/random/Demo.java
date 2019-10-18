package com.qc.random;

import java.util.Random;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.random
 * @ClassName: Demo
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 上午9:53
 * @Version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        int j;
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {

            j = random.nextInt(22);
            System.out.println(j);
        }
    }
}