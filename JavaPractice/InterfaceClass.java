
interface Vehicle {
    void drive();  // Public & abstract by default
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Bike is driving");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.drive();
    }
}
