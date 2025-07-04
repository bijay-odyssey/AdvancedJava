import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Random int: " + rand.nextInt(100)); // 0–99
        System.out.println("Random double: " + rand.nextDouble()); // 0.0–1.0
        System.out.println("Random boolean: " + rand.nextBoolean());
    }
}
