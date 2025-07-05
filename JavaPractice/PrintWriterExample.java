import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("printout.txt")) {
            pw.println("Name: Alice");
            pw.printf("Score: %.2f", 98.45);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
