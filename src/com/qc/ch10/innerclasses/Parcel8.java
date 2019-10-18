package com.qc.ch10.innerclasses;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch10.innerclasses
 * @ClassName: Parcel8
 * @Author: android2
 * @Description:
 * @Date: 2019/10/9 下午2:43
 * @Version: 1.0
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        //创建一个继承自×××父类的匿名类对象，并且通过new返回的引用自动向上转型。
        return new Wrapping(x){
            //覆盖父类Wrapping的value()方法
            @Override
            public int value(){
                return super.value()*17;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8=new Parcel8();
        Wrapping w=parcel8.wrapping(100);
        System.out.println(w.value());
    }
}
