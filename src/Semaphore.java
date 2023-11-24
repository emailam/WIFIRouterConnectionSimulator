
public class Semaphore {
    protected static int value;

    protected Semaphore(int value) {
        this.value = value;
    }

    public synchronized void waitP() throws InterruptedException {
        value--;
        if (value < 0) {
            wait();
        }
    }

    public synchronized void signalV() {
        value++;
        if (value <= 0) {
            notify();
        }
    }

    public Boolean isFull() {
        return value <= 0;
    }
}
