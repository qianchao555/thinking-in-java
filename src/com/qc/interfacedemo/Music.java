package com.qc.interfacedemo;

import com.qc.music.Note;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.interfacedemo
 * @ClassName: Instrument
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 下午4:52
 * @Version: 1.0
 */
interface Instrument {
    /**
     * 玩耍
     *
     * @param note
     */
    void play(Note note);

    /**
     * 调整
     */
}

class Wind implements Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

}

class Percussion implements Instrument {
    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

}

public class Music {
    static void tune(Instrument instrument) {
        instrument.play(Note.B_FLAT);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] in = {
                new Wind(),
                new Percussion()
        };
        tuneAll(in);
    }
}
