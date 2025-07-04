import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            File file2 = new File("example2.txt");

            // Create new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Create new file
            if (file2.createNewFile()) {
                System.out.println("File created: " + file2.getName());
            } else {
                System.out.println("File already exists.");
            }

            // File info
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length());

//             Delete file
             if (file2.delete()) {
                 System.out.println("Deleted: " + file2.getName());
             }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
