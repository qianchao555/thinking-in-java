package ch20;

import org.junit.Test;

/**
 * @ProjectName: ThinkingInJava
 * @Package: ch20
 * @ClassName: Testable
 * @Author: android2
 * @Description:
 * @Date: 2019/10/23 下午2:05
 * @Version: 1.0
 */
public class Testable {
    public void execute() {
        System.out.println("Executing");
    }

    @Test
    public void testExecute() {
        execute();
    }
}
