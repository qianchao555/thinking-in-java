package com.qc.ch10.innerclasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: Percel2
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 上午11:02
 * @Version: 1.0
 */
public class Parcel2 {
    int kk = 12;

    /**
     * 外部方法
     *
     * @param dest
     */
    public void ship(String dest) {
        Contents c = contents();
        Destination destination = to(dest);
        System.out.println(destination.readLine());
    }

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

        //访问外部数据
        int innerInt = kk;


        String readLine() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }


    public static void main(String[] args) {
        Parcel2 parcel2 = new Parcel2();
        parcel2.ship("beijing");
        Parcel2 q2 = new Parcel2();
        Parcel2.Contents c = q2.contents();
        Parcel2.Destination dd = q2.to("yb");
        System.out.println(dd.readLine());
    }
}
