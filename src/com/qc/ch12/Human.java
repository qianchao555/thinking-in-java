package com.qc.ch12;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch12
 * @ClassName: Human
 * @Author: android2
 * @Description:
 * @Date: 2019/10/12 上午10:34
 * @Version: 1.0
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught sneeze.");
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance.");
        }
        try {
            throw new Annoyance();
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance.");
        }
    }
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}
