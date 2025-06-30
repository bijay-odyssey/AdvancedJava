     class Car{
//        fields
        String brand;
        int year;

        void honk(){
            System.out.println(brand +"says: Beep");
        }

    }

    public class Oop{
        public static void main(String[] args){
            Car myCar = new Car();
            myCar.brand = "toyota";
            myCar.year = 2020;

            System.out.println(myCar.brand+" - "+myCar.year);
            myCar.honk();
        }
    }
