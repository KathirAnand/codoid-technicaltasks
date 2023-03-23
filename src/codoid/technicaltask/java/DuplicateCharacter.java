package codoid.technicaltask.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		 String str = "Hello, world!";
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert string to character array
	        char[] chars = str.toCharArray();

	        // Loop through the characters in the array
	        for (char c : chars) {
	            if (charCountMap.containsKey(c)) {
	                // Character already present in map, increment count
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                // Character not present in map, add to map with count 1
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print out the duplicate characters and their counts
	        System.out.println("Duplicate characters in the string \"" + str + "\":");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
	            }
	        }
		// TODO Auto-generated method stub

	}

}
