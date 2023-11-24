import java.util.ArrayList;

public class Router {
    protected static ArrayList<Device>connected;
    static int size;

    public static void setSize(int size){
        connected = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            connected.add(null);
        }
        Router.size = size;
    }

    public static void add(Device device){
        for (int i = 0; i < size; i++) {
            if(connected.get(i) == null){
                connected.set(i, device);
                device.setConnectionNum(i + 1);
                System.out.println("Connection " + (i + 1) + ": " + device.getDeviceName() + " Occupied");
                break;
            }
        }
    }

    public static void remove(Device device){
        for (int i = 0; i < size; i++) {
            if(connected.get(i) == device){
                connected.set(i, null);
                device.setConnectionNum(0);
                break;
            }
        }
    }
}
