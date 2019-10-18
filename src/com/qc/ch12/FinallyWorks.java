package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: FinallyWorks
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午9:03
 * @Version: 1.0
 */
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("no exception");
            } catch (ThreeException e) {
                System.out.println("threeException");
            }finally {
                System.out.println("In finally clause");
                if(count==3){
                    break;
                }
            }
        }
    }
}

class ThreeException extends Exception {
}
