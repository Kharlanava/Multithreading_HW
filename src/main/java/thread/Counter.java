package thread;

public class Counter {
    private int count;

    public Counter(int counter) {
        this.count = counter;
    }

    public int getCount() {
        return count;
    }

    public int increment() {
        return count++;
    }
}
