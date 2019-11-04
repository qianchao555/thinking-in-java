package com.qc.ch13.strings;

import java.util.Scanner;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch13.strings
 * @ClassName: ScannerDelimiter
 * @Author: android2
 * @Description:
 * @Date: 2019/10/28 下午3:07
 * @Version: 1.0
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner("12  , 13, 15    ,16 ,11");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNext()){
            System.out.println(scanner.nextInt());
        }
    }
    public void ScannerDelimiter(){
        //普通方法
    }
    public ScannerDelimiter(){

    }
}
