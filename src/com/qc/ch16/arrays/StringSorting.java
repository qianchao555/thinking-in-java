package com.qc.ch16.arrays;

import java.util.Arrays;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch16.arrays
 * @ClassName: StringSorting
 * @Author: android2
 * @Description:
 * @Date: 2019/10/16 下午3:09
 * @Version: 1.0
 */
public class StringSorting {
    public static void main(String[] args) {
        int[] i1 = {3, 4, 1, 6, 4};
        Arrays.sort(i1);
        System.out.println(Arrays.binarySearch(i1, 4));
        //        System.out.println();
//        String []str1={"wode","nide","Tade"};
//        System.out.println(Arrays.toString(str1));
//        Arrays.sort(str1);
//        System.out.println(Arrays.toString(str1));


    }
}
