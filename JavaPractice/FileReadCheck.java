import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FileReadCheck {
    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");
        Scanner sc =  new Scanner(file);

        while (sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }

    }
}
