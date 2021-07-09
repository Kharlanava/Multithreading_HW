package thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = LogManager.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getCount() < 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getCount());
        }
    }
}
