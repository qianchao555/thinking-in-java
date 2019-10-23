package com.qc.ch19;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch19
 * @ClassName: Burrito
 * @Author: android2
 * @Description:
 * @Date: 2019/10/21 上午11:22
 * @Version: 1.0
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }
    @Override
    public String toString(){
        return "Burrito is"+degree;
    }

    public static void main(String[] args) {
        System.out.println((new Burrito(Spiciness.NOT)));
        System.out.println((new Burrito(Spiciness.MEDIUM)));
        System.out.println((new Burrito(Spiciness.HOT)));

    }

}
