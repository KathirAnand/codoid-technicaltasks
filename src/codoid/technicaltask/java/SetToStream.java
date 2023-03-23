package codoid.technicaltask.java;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetToStream {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("orange");

		// Convert Set to Stream
		Stream<String> stream = set.stream();

		// Process Stream elements
		stream.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
