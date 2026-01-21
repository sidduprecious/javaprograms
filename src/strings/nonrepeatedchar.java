package strings;
import java.util.HashMap;
import java.util.Map;

public class nonrepeatedchar {
    public static void main(String[] args) {

        String s = "swiss";

        // Step 1: Create HashMap to store character and its frequency
        Map<Character, Integer> map = new HashMap<>();

        // Step 2: Convert string to char array and count frequency
        for (char c : s.toCharArray()) {

            // If character already exists, increase count
            // else put count as 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 3: Loop again through string to find first non-repeated
        for (char c : s.toCharArray()) {

            if (map.get(c) == 1) {   // frequency is 1 → non-repeated
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }
}
