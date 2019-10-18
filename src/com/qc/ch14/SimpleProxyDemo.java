package com.qc.ch14;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch14
 * @ClassName: SimpleProxyDemo
 * @Author: android2
 * @Description:
 * @Date: 2019/10/14 上午11:37
 * @Version: 1.0
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iFace) {
        iFace.doSomething();
        iFace.somethingElse("hhh");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

interface Interface {
    void doSomething();

    void somethingElse(String string);
}

class RealObject implements Interface {
    @Override
    public void somethingElse(String string) {
        System.out.println("somethingElse " + string);
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething ");
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        //proxied代理的RealObject对象!!!
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String string) {
        System.out.println("SimpleProxy somethingElse " + string);
        proxied.somethingElse(string);
    }
}
