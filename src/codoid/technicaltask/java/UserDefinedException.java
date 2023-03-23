package codoid.technicaltask.java;

import java.util.Scanner;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter the age of  yours:");
			int age = input.nextInt();
			try {
				if (age < 18) {
					throw new MyException("Age is less than 18, not eligible to vote");
				} else {
					System.out.println("You are eligible to vote");
				}
			} catch (MyException e) {
				System.out.println("Caught exception: " + e.getMessage());
			}
			// TODO Auto-generated method stub
		}

	}

}
