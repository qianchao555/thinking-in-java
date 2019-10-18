package com.qc.ch10.lambda;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.lamda
 * @ClassName: Demo1
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 下午2:54
 * @Version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程跑起来了");
//            }
//        }).start();


        /**
         * jdk8 新特性
         */
// jdk8 lamda表达式    连接口和函数名都省略了!!!
//        new Thread(() -> System.out.println("run ")).start();

        new Thread(() -> {
            //函数体超过一行用{}括起来
            System.out.println("one ");
            System.out.println("two");
        }).start();
    }

}
