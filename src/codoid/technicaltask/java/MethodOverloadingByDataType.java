package codoid.technicaltask.java;

public class MethodOverloadingByDataType {

	public static void main(String[] args) {
		MethodOverloadingByDataType obj = new MethodOverloadingByDataType();

		obj.print(5); // Calls first print() method
		obj.print("Hello"); // Calls second print() method
		obj.print(2.5f); // Calls third print() method
		// TODO Auto-generated method stub

	}

	public void print(int num) {
		System.out.println("Integer: " + num);
	}

	public void print(String str) {
		System.out.println("String: " + str);
	}

	public void print(float num) {
		System.out.println("Float: " + num);
	}

}
