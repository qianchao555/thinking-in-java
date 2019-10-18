package com.qc.ch10.lambda.functioninterface;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.lambda.functioninterface
 * @ClassName: Test
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 下午3:39
 * @Version: 1.0
 */
public class Test{
    private static void testConsumerInterface(ConsumerInterface consumerInterface, int in) {
        //调用自定义的函数式接口方法
        System.out.println(consumerInterface.accept(in));
    }

    public static void main(String[] args) {
        //调用使用函数式接口的方法
        testConsumerInterface((x) -> {
            return x;
        }, 15+1);
    }

}
