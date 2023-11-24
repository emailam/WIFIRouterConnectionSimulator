import java.util.Scanner;

public class Network {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSaver.clearFile();

        System.out.print("What is the number of WI-FI Connections?");
        int maxConnections = scanner.nextInt();

        System.out.print("What is the number of devices Clients want to connect?");
        int totalDevices = scanner.nextInt();


        Router.setSize(maxConnections);
        Semaphore s = new Semaphore(maxConnections);

        Device[] devices = new Device[totalDevices];

        for (int i = 0; i < totalDevices; i++) {
            System.out.print("Enter the name of Device " + (i + 1) + ": ");
            String name = scanner.next();

            System.out.print("Enter the type of Device " + (i + 1) + " (e.g., mobile, tablet, pc): ");
            String type = scanner.next();

            devices[i] = new Device(name, type, s);
        }

        for (Device device : devices) {
            device.start();
        }

        scanner.close();
    }
}