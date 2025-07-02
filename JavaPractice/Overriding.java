class Animal1 {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Cat extends Animal1 {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal1 myAnimal = new Cat(); // Upcasting
        myAnimal.sound(); // Calls overridden method in Cat
    }
}
