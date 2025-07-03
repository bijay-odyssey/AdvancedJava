public class WrapperDemo {
    public static void main(String[] args) {
        int a = 5;
        Integer obj = a;  // Autoboxing
        int b = obj;      // Unboxing

        System.out.println("Integer: " + obj);
        System.out.println("Primitive: " + b);

        // Useful methods
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);  // Convert String to int
        System.out.println("Parsed int: " + parsed);
    }
}
