package com.qc.ch10.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.lambda
 * @ClassName: Demo2Consumer
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 上午10:07
 * @Version: 1.0
 */
public class Demo2Consumer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("I", "love", "you"));
        //遍历长度大于3的字符串
        list.forEach((str) -> {
            if (str.length() > 3) {
                System.out.println(str);
            }
        });

        //排序
        List<String> list2 = new ArrayList<>(Arrays.asList("1,2,3", "skf", "s"));
        list2.sort((x, y) -> x.length() - y.length());
        System.out.println(list2);
    }
}
