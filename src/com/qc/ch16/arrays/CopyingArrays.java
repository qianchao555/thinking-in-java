package com.qc.ch16.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch16.arrays
 * @ClassName: CopyingArrays
 * @Author: android2
 * @Description:
 * @Date: 2019/10/16 下午2:34
 * @Version: 1.0
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        int[] arr2 = new int[10];
        String [] s1=new String[5];
        Arrays.fill(s1,"12");
        Arrays.fill(arr1, 6);
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //2  需要复制的个数
        System.arraycopy(arr1,0,arr2,1,2);
        System.out.println(Arrays.toString(arr2));

    }
}
