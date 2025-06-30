import java.util.Scanner;

public class ScanIo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Hello "+name+ " You are "+age+" years old");
        scanner.close();

    }
}
