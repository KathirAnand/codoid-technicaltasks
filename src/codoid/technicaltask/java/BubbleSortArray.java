package codoid.technicaltask.java;

public class BubbleSortArray {

	public static void main(String[] args) {
		 int[] arr = {5, 3, 8, 4, 2};
		    
		    // Print unsorted array
		    System.out.println("Unsorted Array:");
		    printArray(arr);
		    
		    // Perform bubble sort
		    bubbleSort(arr);
		    
		    // Print sorted array
		    System.out.println("\nSorted Array:");
		    printArray(arr);
		// TODO Auto-generated method stub

	}
	 public static void bubbleSort(int[] arr) {
		    int n = arr.length;
		    
		    // Outer loop iterates n-1 times
		    for (int i = 0; i < n - 1; i++) {
		      
		      // Inner loop iterates n-i-1 times
		      for (int j = 0; j < n - i - 1; j++) {
		        
		        // Swap adjacent elements if they are in wrong order
		        if (arr[j] > arr[j+1]) {
		          int temp = arr[j];
		          arr[j] = arr[j+1];
		          arr[j+1] = temp;
		        }
		      }
		    }
		  }
		  
		  public static void printArray(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		  }
		

}
