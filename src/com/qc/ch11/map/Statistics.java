package com.qc.ch11.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch11.map
 * @ClassName: Statistics
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 下午2:22
 * @Version: 1.0
 */
public class Statistics {
    /**
     * 记录随机数0-x出现的次数!!!
     * K-V
     * k随机数,V次数
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int r = random.nextInt(10);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
