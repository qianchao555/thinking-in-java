package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: Switch
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午9:19
 * @Version: 1.0
 */
public class Switch {

    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }

    public static void f() throws OnOffException1, OnOffException2 {
        throw new OnOffException1();


    }


    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        try {
            aSwitch.on();
            f();
        } catch (OnOffException1 onOffException1) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
        }finally {
            aSwitch.off();
        }
    }
}

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}
