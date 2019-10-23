package com.qc.ch19;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch19
 * @ClassName: OzWitch
 * @Author: android2
 * @Description:
 * @Date: 2019/10/21 上午11:36
 * @Version: 1.0
 */
public enum OzWitch {
    WEST("this is west"),

    NORTH("this is north");

    private String description;

    OzWitch(String s) {
        this.description = s;
    }

    public String getDescription() {
        return description;
    }


    public static void main(String[] args) {
        for (OzWitch ozWitch : OzWitch.values()) {
            System.out.println(ozWitch.getDescription());
        }
    }
}
