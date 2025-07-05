import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
            bw.write("Line 1");
            bw.newLine();
            bw.write("Line 2");
            System.out.println("Buffered write complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
