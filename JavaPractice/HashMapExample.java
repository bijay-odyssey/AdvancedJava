import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, Integer> scores =  new HashMap<>();
        scores.put("Ab", 50);
        scores.put("Bc", 60);

        System.out.println(scores.get("Ab"));

        for(String key : scores.keySet()){
            System.out.println(scores.get(key));
        }


    }

}
