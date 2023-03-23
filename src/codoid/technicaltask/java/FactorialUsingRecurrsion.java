package codoid.technicaltask.java;

import java.util.Scanner;

public class FactorialUsingRecurrsion {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			int result = factorial(num);
			System.out.println(num + "! = " + result);
			// TODO Auto-generated method stub
		}

	}

}
