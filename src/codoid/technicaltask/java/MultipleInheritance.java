package codoid.technicaltask.java;

interface Employee {
	public void empSalary();
}

interface Manager {
	public void managerSalary();
}

class Company implements Employee, Manager {

	@Override
	public void managerSalary() {
		System.out.println("Employee salary is 20000");
		// TODO Auto-generated method stub

	}

	@Override
	public void empSalary() {
		System.out.println("Manager salary is 50000");
		// TODO Auto-generated method stub

	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		Company company = new Company();
		company.empSalary();
		company.managerSalary();
		// TODO Auto-generated method stub

	}

}
