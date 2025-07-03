import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Kathmandu");
        cities.add("Bhaktapur");

        cities.addFirst("Pokhara");
        cities.addLast("Lalitpur");

        cities.remove("Bhaktapur");

        System.out.println("Cities: " + cities);
    }
}
