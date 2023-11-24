
public class Network {
    public static void main(String[] args) {
        int maxConnections = 2;
        int totalDevices = 4;

        Router.setSize(maxConnections);
        Semaphore s = new Semaphore(maxConnections);

        Device[] devices = new Device[totalDevices];
        devices[0] = new Device("C1", "mobile", s);
        devices[1] = new Device("C2", "tablet", s);
        devices[2] = new Device("C3", "pc", s);
        devices[3] = new Device("C4", "pc", s);

        for (Device device : devices) {
            device.start();
        }

    }
}