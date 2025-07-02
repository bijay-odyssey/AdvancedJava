class PersonDemo {
    String name;

    PersonDemo(String name) {
        this.name = name;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        PersonDemo p1 = new PersonDemo("Alice");
        PersonDemo p2 = new PersonDemo("Alice");

        System.out.println(p1);  //
        System.out.println("Equal? " + p1.equals(p2));

    }
}