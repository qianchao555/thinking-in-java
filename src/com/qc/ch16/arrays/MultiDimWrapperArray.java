package com.qc.ch16.arrays;

import java.util.Arrays;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch16.arrays
 * @ClassName: MultiDimWrapperArray
 * @Author: android2
 * @Description:
 * @Date: 2019/10/16 上午11:34
 * @Version: 1.0
 */
public class MultiDimWrapperArray {
    public static void main(String[] args) {
        Integer[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(a1));
        System.out.println(a1);
    }
}
