package ch20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: ThinkingInJava
 * @Package: ch20
 * @ClassName: AtomicityTest
 * @Author: android2
 * @Description:
 * @Date: 2019/10/25 上午8:58
 * @Version: 1.0
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    private int getValues() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        executorService.execute(at);
        while (true) {
            int val = at.getValues();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }

}
