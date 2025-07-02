public class StringDemo {
    public static void main(String[] args){
        String name = "Bijay";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(1,4));


        System.out.println(name.equals("bijay"));
        System.out.println(name.equalsIgnoreCase("bijay"));


    System.out.println(name.replace("a", "o"));

    String fullName = name + " Pariyar";
    System.out.println(fullName);
    }


}
