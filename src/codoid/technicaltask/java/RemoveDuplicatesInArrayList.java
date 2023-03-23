package codoid.technicaltask.java;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesInArrayList {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicates = new ArrayList<>();
		listWithDuplicates.add("apple");
		listWithDuplicates.add("banana");
		listWithDuplicates.add("orange");
		listWithDuplicates.add("apple");
		listWithDuplicates.add("kiwi");
		listWithDuplicates.add("banana");

		ArrayList<String> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));

		System.out.println("List with duplicates: " + listWithDuplicates);
		System.out.println("List without duplicates: " + listWithoutDuplicates);
		// TODO Auto-generated method stub

	}

}
