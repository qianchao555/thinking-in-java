package com.qc.ch11.stack;

/**
 * @ProjectName: ThinkInJava
 * @Package: com.qc.ch11.stack
 * @ClassName: StackTest
 * @Author: android2
 * @Description:
 * @Date: 2019/10/11 上午11:41
 * @Version: 1.0
 */
public class StackTest {
    public static void main(String[] args) {
        //Stack为当前包下的Stack类
        Stack<String> stack = new Stack<>();
        String str = "my dog has fleas";
        for (String s : str.split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
