
public class Semaphore {
    protected static int value;

    protected Semaphore(int value){
        this.value = value;
    }

    public synchronized void waitP() throws InterruptedException {
        value --;
        if(value < 0){
            System.out.println(" and waiting");
            wait();
        }
    }

    public synchronized void signalV(){
        value ++;
        if(value <= 0){
            notify();
        }
    }
}
