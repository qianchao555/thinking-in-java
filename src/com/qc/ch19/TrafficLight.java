package com.qc.ch19;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch19
 * @ClassName: TrafficLight
 * @Author: android2
 * @Description:
 * @Date: 2019/10/21 上午11:47
 * @Version: 1.0
 */
public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "the traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 5; i++) {
            System.out.println(trafficLight);
            trafficLight.change();
        }
    }
}

enum Signal {GREEN, YELLOW, RED}
