package com.qc.ch15.generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics
 * @ClassName: RandomList
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午9:22
 * @Version: 1.0
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random random = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    /**
     * 随机选取一个元素
     *
     * @return
     */
    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        String strings = "the quick brown fox jumped over th lazy";
        for (String s : strings.split(" ")) {
            rs.add(s);
        }
        int length = strings.split(" ").length;
        for (int i = 0; i < length; i++) {
            System.out.print(rs.select() + "  ");
        }
    }
}
