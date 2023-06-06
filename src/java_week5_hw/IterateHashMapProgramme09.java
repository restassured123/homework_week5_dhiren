package java_week5_hw;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class IterateHashMapProgramme09 {

    public static void main(String[] args) {
        HashMap < String , Integer> person = new HashMap<>();

        person.put("Alice" , 25);
        person.put("Bob", 30);
        person.put("Charlie", 30);
        person.put("David", 40);

        System.out.println("Values in the map: ");

        for (Integer value:person.values()){
            System.out.println(value);
        }
    }
}
