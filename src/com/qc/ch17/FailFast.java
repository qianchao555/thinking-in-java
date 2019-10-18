package com.qc.ch17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch17
 * @ClassName: FailFast
 * @Author: android2
 * @Description:
 * @Date: 2019/10/17 上午10:37
 * @Version: 1.0
 */
public class FailFast {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        Iterator<String> I1 = c1.iterator();
        c1.add("s");
        String string = I1.next();
    }

}
