package com.qc.ch11.stack;

import java.util.Stack;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch11.stack
 * @ClassName: Exercise15
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 下午1:40
 * @Version: 1.0
 */
public class Exercise15 {
    public static void main(String[] args) {
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        Stack<Character> stack = new Stack<>();
        int strLength = string.length();
        for (int i = 0; i < strLength; i++) {
            switch (string.charAt(i)) {
                case '+':
                    Character c = string.charAt(++i);
                    if (c != '-' && c != '+') {
                        stack.push(string.charAt(i));
                        System.out.println(string.charAt(i) + "入栈  ");
                        System.out.println(stack.toString());
                    }
                    break;
                case '-':
                    System.out.println(stack.pop()+" 出栈");
                    System.out.println(stack.toString());
                    break;
                default:
                    break;
            }
        }
    }
}
