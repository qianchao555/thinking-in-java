package com.qc.ch13.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ProjectName: ThinkingInJava
 * @Package: com.qc.ch13.strings
 * @ClassName: TestRegularExpression
 * @Author: android2
 * @Description:
 * @Date: 2019/10/28 上午8:58
 * @Version: 1.0
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("jfkds");
            System.exit(0);
        }
        System.out.println("input:"+args[0]+"\"");
        for(String arg:args){
            System.out.println("regular expression:"+arg+"\"");
            Pattern pattern=Pattern.compile(arg);
            Matcher m=pattern.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \""+m.group()+"\"+at positions"+m.start()+"-"+(m.end()-1));
            }
        }
    }
}
