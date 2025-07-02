class Person{
    private String name;

//    Getter
    public String getName(){
        return name;
    }

//    Setter
    public void setName(String newName){
        name = newName;
    }

}

public class Encapsulate {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Ram");
        System.out.println(p.getName());
    }
}
