package com.qc.ch10.innerclasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: Parcel9
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午3:40
 * @Version: 1.0
 */
public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 10) {
                    System.out.println("over budget!");
                }
            }

            private String label = dest;

            public String readLine() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination d = parcel10.destination("beijing", 15);
        System.out.println();
    }
}
