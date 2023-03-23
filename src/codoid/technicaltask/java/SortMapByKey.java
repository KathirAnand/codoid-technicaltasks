package codoid.technicaltask.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		 Map<String, Integer> unsortedMap = new HashMap<>();
	        unsortedMap.put("apple", 5);
	        unsortedMap.put("banana", 3);
	        unsortedMap.put("cherry", 8);
	        unsortedMap.put("date", 1);
	        unsortedMap.put("elderberry", 6);

	        Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

	        System.out.println("Unsorted Map: " + unsortedMap);
	        System.out.println("Sorted Map by Key: " + sortedMap);
		// TODO Auto-generated method stub

	}

}
