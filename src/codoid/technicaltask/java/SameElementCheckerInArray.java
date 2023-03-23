package codoid.technicaltask.java;

public class SameElementCheckerInArray {
	public static boolean hasSameElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 }; // no same elements
		int[] arr2 = { 1, 2, 3, 3, 4 }; // contains same element

		System.out.println(hasSameElement(arr1));
		System.out.println(hasSameElement(arr2));
		// TODO Auto-generated method stub

	}

}
