package com.qc.ch15.generics.fib;

import java.util.Iterator;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch15.generics.fib
 * @ClassName: IterableFibonacci
 * @Author: android2
 * @Description:
 * @Date: 2019/10/15 上午10:04
 * @Version: 1.0
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
   private int n;
   public IterableFibonacci(int count){
       n=count;
   }
   @Override
   public Iterator<Integer> iterator(){
       return new Iterator<Integer>() {
           @Override
           public boolean hasNext() {
               return  n>0;
           }

           @Override
           public Integer next() {
               n--;
               return IterableFibonacci.this.next();
           }
       };
   }

    public static void main(String[] args) {
        for(int i:new IterableFibonacci(18)){
            System.out.println(i);
        }
    }
}
