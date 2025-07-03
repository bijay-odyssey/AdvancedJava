class Person2 {
    String name;

    Person2(String name) {
        this.name = name;
    }

    // Override toString
    @Override
    public String toString() {
        return "Person[name=" + name + "]";
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person2)) return false;
        Person2 other = (Person2) obj;
        return this.name.equals(other.name);
    }
}

public class ObjectDemo2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Alice");
        Person2 p2 = new Person2("Alice");

        System.out.println(p1);  // toString()
        System.out.println("Equal? " + p1.equals(p2));  // true
        System.out.println("HashCode: " + p1.hashCode());
        System.out.println("Class: " + p1.getClass());
    }
}
