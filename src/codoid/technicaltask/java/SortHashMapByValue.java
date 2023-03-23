package codoid.technicaltask.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {

	public static void main(String[] args) {
		 // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 23);
        hashMap.put("Mary", 18);
        hashMap.put("Bob", 32);
        hashMap.put("Alice", 27);

        // Convert the HashMap to a List of Map.Entry objects
        List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(hashMap.entrySet());

        // Sort the List using a custom Comparator that compares the values of the entries
        Collections.sort(entriesList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Create a new LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();

        // Iterate through the sorted List and add the entries to the new LinkedHashMap
        for (Map.Entry<String, Integer> entry : entriesList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted LinkedHashMap
        System.out.println(sortedHashMap);
		// TODO Auto-generated method stub

	}

}
