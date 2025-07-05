import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class AppendFileExample {
    public static void main(String[] args) throws IOException {
        // Append text to the file
        FileWriter fw = new FileWriter("output.txt", true);
        fw.write("Hello text Appended\n");  // Always add newline when appending lines
        fw.close();

        // Read the file line by line
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
