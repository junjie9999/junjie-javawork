package inheritance;

public class employee extends person {
	int empid;
	public employee() {}
	public employee(String name, int age, int empid) {
		super(name, age);
		this.empid= empid;

	}
	public void dosomething() {
		System.out.println("do something");
	}


	

}
