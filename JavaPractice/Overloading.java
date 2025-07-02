class MathOperations{
    int add(int a , int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}


public class Overloading {
    public static void main(String[] args){
        MathOperations mo = new MathOperations();
        System.out.println(mo.add(5,4));
        System.out.println(mo.add(4.5, 6.5));
        System.out.println("It is Complie-time polymorphism");
        System.out.println("Also Method Overloading");


    }
}
