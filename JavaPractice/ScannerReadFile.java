import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ScannerReadFile {
    public static void main(String[] args){
        try{
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();


        } catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
