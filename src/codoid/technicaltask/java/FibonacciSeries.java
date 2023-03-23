package codoid.technicaltask.java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of terms: ");
			int n = sc.nextInt();

			int a = 0, b = 1;
			System.out.print("Fibonacci Series: ");
			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				int sum = a + b;
				a = b;
				b = sum;
			}
		}

	}

}
