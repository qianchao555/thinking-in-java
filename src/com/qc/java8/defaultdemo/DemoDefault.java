package com.qc.java8.defaultdemo;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.java8.defaultdemo
 * @ClassName: DemoDefault
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 上午8:28
 * @Version: 1.0
 */
public class DemoDefault implements Interface1, Interface2 {
    public static void main(String[] args) {
        DemoDefault demoDefault = new DemoDefault();
        demoDefault.hello();
    }

    @Override
    public void hello() {
        System.out.println("my DemoDefault");
    }
}

interface Interface1 {
    /**
     * java8 新增default修饰接口中的方法
     * say hello
     */
    default void hello() {
        System.out.println("hello world");
    }
}

interface Interface2 {
    /**
     * say my I2
     */
    default void hello() {
        System.out.println("my Interface2");
    }
}

/**
 * 类优先于接口
 */
class DemoDefault2 extends DemoDefault implements Interface2 {
    public static void main(String[] args) {

        DemoDefault2 default2 = new DemoDefault2();
        default2.hello();
    }
}
