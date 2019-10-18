package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: Parcel1
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 上午10:37
 * @Version: 1.0
 */
public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLine() {
            return label;
        }
    }

    /**
     * 外部方法，将去调用内部类方法。
     * @param dest
     */
    public void ship(String dest){
        Contents contents=new Contents();
        Destination destination=new Destination(dest);
        System.out.println(destination.readLine());
    }

    public static void main(String[] args) {
        Parcel1 parcel1=new Parcel1();
        parcel1.ship("Beijing");
    }
}
