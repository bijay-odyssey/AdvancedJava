import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        fruits.remove("Banana");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size: " + fruits.size());
    }
}
