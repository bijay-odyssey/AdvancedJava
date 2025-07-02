abstract class Shape {
    abstract void draw();  // Abstract method
    void description() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();  // Cannot instantiate abstract class directly
        s.draw();
        s.description();
    }
}
