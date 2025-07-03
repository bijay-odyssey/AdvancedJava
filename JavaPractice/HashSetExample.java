import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<>();

        names.add("ab");
        names.add("bc");
        names.add("cd");
        names.add("cd");


        for (String name : names){
            System.out.println(name);
        }
    }
}
