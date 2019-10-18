package com.qc.ch10.innerclasses;

interface Counter {
    int next();
}

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: LocalInnerClass
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 下午1:44
 * @Version: 1.0
 */
public class LocalInnerClass {
    private int count = 0;

    /**
     * 普通方法
     *
     * @param name
     * @return
     */
    Counter getCounter(String name) {
        /**
         * 局部内部类,不能有限定说明符
         */
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(String name) {
        /**
         * 匿名内部类
         */
        return new Counter() {
            {
                System.out.println("Counter");
            }

            @Override
            public int next() {
                System.out.print(name+" ");
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass=new LocalInnerClass();
        Counter counter1=localInnerClass.getCounter("Local inner class"),
                counter2=localInnerClass.getCounter2("anonymous inner class");
        for (int i=0;i<5;i++){
            System.out.println(counter1.next()+" ");
        }
        for (int i=0;i<5;i++){
            System.out.println(counter2.next()+" ");
        }
    }
}





