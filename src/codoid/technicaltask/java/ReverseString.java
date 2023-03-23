package codoid.technicaltask.java;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello, World!";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reversedStr = sb.toString();
		System.out.println(reversedStr);
		// TODO Auto-generated method stub

	}

}
