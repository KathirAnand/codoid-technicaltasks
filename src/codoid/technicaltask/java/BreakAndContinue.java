package codoid.technicaltask.java;

public class BreakAndContinue {

	public static void main(String[] args) {
		int i = 0;

		while (i < 10) {
			i++;

			// Use continue statement to skip even numbers
			if (i % 2 == 0) {
				continue;
			}

			// Use break statement to exit loop when i equals 7
			if (i == 7) {
				break;
			}

			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}