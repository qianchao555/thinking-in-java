package com.qc.ch17;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch17
 * @ClassName: Stack
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 上午11:04
 * @Version: 1.0
 */
public class Stack {
    public static void main(String[] args) {
        /**
         * 利用LinkList实现Stack结构
         */
        LinkedList<String> linkedList = new LinkedList<>();
        for (Month m : Month.values()) {
            //将指定元素插入此列表的开头
            linkedList.addFirst(m.toString());
        }
        System.out.println(linkedList);
        while (!linkedList.isEmpty()) {
            //移除并返回此列表的第一个元素
            System.out.print(linkedList.removeFirst() + " ");
        }
    }
}

enum Month {
    January, February, March, April, May, June, July, August, September, November
}

