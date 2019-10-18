package com.qc.music;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.music
 * @ClassName: Note
 * @Author: android2
 * @Description:
 * @Date: 2019/10/8 上午9:27
 * @Version: 1.0
 */
public enum Note {
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
    public void play(Note n){
        System.out.println("instrument.play()");
    }
}
