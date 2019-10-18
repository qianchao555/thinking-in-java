package com.qc.ch11.stack;

import java.util.LinkedList;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.stack
 * @ClassName: LinkedListImpStack
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 下午4:36
 * @Version: 1.0
 */
public class Stack<T> {
    /**
     * 利用LinkedList来实现Stack结构
     */
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
