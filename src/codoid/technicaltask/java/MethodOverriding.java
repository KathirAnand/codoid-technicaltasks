package codoid.technicaltask.java;

class Fruits{
	public void rate() {
		System.out.println("rate is different for different fruits");
	}
}
class Apple extends Fruits{
	public void rate(){
		System.out.println("rate for apple is 150/kg");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Fruits fruits=new Fruits();
		fruits.rate();
		Apple apple=new Apple();
		apple.rate();
		// TODO Auto-generated method stub

	}

}
