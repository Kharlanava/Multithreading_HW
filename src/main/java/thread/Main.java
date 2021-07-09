package thread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Thread myThread = new MyThread(counter);
        Thread myRunnable = new Thread(new MyRunnable(counter));

        myThread.start();
        myRunnable.start();
    }
}
