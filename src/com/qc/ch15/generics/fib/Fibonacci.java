package com.qc.ch15.generics.fib;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics.fib
 * @ClassName: Fibonacci
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午9:50
 * @Version: 1.0
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        for(int i=0;i<18;i++){
            System.out.print(fibonacci.next()+"  ");
        }
    }
}
