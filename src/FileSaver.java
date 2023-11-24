import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver {
    private static ArrayList<String> lines = new ArrayList<>();
    private static final String FILE_NAME = "output.txt";

    private FileSaver() {
    }

    public static void addLine(String s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(s);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void clearFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            // Write nothing.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
