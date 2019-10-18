package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: Factories
 * @Author: android2
 * @Description:
 * @Date: 2019/10/10 上午8:00
 * @Version: 1.0
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        //分别指向实现一和二
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation1 method1.");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2.");
    }

    /**
     * 静态变量属于类
     */
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation2 method1.");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2.");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        //普通内部类不能申明有static数据和字段
        //static int j;
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}


