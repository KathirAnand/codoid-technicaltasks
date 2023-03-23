package codoid.technicaltask.java;

public class MethodOverloadingByArguments {

	public static void main(String[] args) {
		MethodOverloadingByArguments obj = new MethodOverloadingByArguments();

		obj.print(5); // Calls first print() method
		obj.print(5, "Hello"); // Calls second print() method
		obj.print(2.5f); // Calls third print() method
		// TODO Auto-generated method stub

	}

	public void print(int num) {
		System.out.println("Integer: " + num);
	}

	public void print(int num, String str) {
		System.out.println("Integer: " + num + ", String: " + str);
	}

	public void print(float num) {
		System.out.println("Float: " + num);
	}

}
