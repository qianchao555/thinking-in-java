package com.qc.music;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.music
 * @ClassName: Wind
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 上午9:29
 * @Version: 1.0
 */
public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("wind.play()");
    }
}
