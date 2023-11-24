import java.util.Random;

public class Device extends Thread {
    protected String name, type;
    protected Semaphore s;
    protected int connectionNum;

    protected Device(String name, String type, Semaphore s) {
        this.name = name;
        this.type = type;
        this.s = s;
    }

    public void connect() throws InterruptedException {
        s.waitP();
        Router.add(this);
    }

    public void logIn() {
        FileSaver.addLine("Connection " + connectionNum + ": " + name + " login");
    }

    public void perform() {
        FileSaver.addLine("Connection " + connectionNum + ": " + name + " performs online activity");
    }

    public void logOut() {
        FileSaver.addLine("Connection " + connectionNum + ": " + name + " LoggedOut");
        Router.remove(this);
        s.signalV();
    }

    public void randomWait() throws InterruptedException {
        Random rand = new Random();
        sleep(rand.nextInt(1000));
    }

    public void run() {
        try {
            randomWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (s.isFull()) {
            FileSaver.addLine("(" + name + ") (" + type + ") arrived" + " and waiting");
        }
        else{
            FileSaver.addLine("(" + name + ") (" + type + ") arrived");
        }
        try {
            connect();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            randomWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logIn();

        try {
            randomWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        perform();

        try {
            randomWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logOut();
    }

    public void setConnectionNum(int num) {
        connectionNum = num;
    }

    public String getDeviceName() {
        return name;
    }
}
