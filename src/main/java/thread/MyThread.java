package thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = LogManager.getLogger(MyThread.class);
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getCount());
        }
    }
}
