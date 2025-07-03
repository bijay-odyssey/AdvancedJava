import java.util.Scanner;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello, " + name);

        long start = System.currentTimeMillis();
        // Some delay
        for (long i = 0; i < 1_000_000_000L; i++) {}
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");

        System.exit(0);  // Exit the program
        // Anything below won't run
         System.out.println("This won't print");
    }
}
