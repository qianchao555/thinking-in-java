package com.qc.ch11.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch11.iterator
 * @ClassName: ListIterator
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 下午3:21
 * @Version: 1.0
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("he", "llo", "world", "!"));
        ListIterator<String> stringListIterator = stringList.listIterator();
        System.out.println(stringListIterator);
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next() + "," + stringListIterator.nextIndex() + "," + stringListIterator.previousIndex());
        }
        System.out.println(stringList);
        //一开始便指向索引位置
        stringListIterator=stringList.listIterator(2);
        while (stringListIterator.hasNext()){
            stringListIterator.next();
            //set()替换它访问过的最后一个元素
            stringListIterator.set("11");
        }
        System.out.println(stringList);
    }
}
