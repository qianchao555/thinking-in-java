package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: parcel5
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午2:18
 * @Version: 1.0
 */
public class Parcel5 {
    public Destination destination(String s) {
        /**
         * 方法里面，局部内部类
         */
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLine() {
                return label;
            }
        }
        //自动向上转型为Destination
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5=new Parcel5();
        Destination destination=parcel5.destination("beijing");

    }
}
