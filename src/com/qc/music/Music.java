package com.qc.music;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.music
 * @ClassName: Music
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 上午9:31
 * @Version: 1.0
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.C_SHARP);
    }

    public static void main(String[] args) {
        Wind wind=new Wind();
        tune(wind);
    }
}
