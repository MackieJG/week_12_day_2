import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String, String> favouriteFruits = new HashMap<>();

        favouriteFruits.put("Alice","Apple");
        favouriteFruits.put("Bessie", "Banana");
        favouriteFruits.put("Olly", "Orange");
        System.out.println(favouriteFruits.get("Bessie"));

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ash", 100);
        ages.put("Ben", 21);
        ages.put("Steve", 80);
        ages.put("Buddy", 5);

        Integer ashAge = ages.get("Ash");

        String output = "Ash's age is " + ashAge;
        System.out.println(output);
    }
}
