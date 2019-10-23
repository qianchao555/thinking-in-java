package com.qc.ch19;

import java.text.DateFormat;
import java.util.Date;

import static org.classpath.icedtea.pulseaudio.PulseAudioMixerInfo.getInfo;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch19
 * @ClassName: ConstantSpecifiMethod
 * @Author: android2
 * @Description:
 * @Date: 2019/10/23 下午1:48
 * @Version: 1.0
 */
public enum  ConstantSpecifiMethod {
    DATE_TME{
        @Override
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for(ConstantSpecifiMethod cs:values()){
            System.out.println(cs.getInfo());
        }
    }
}
