package com.qc.ch11.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.queue
 * @ClassName: QueueDemo
 * @Author: android2
 * @Description:
 * @Date: 2019/10/18 上午9:23
 * @Version: 1.0
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove()+"  ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random r = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(r.nextInt(i+10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
