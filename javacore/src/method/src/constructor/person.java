package constructor;

public class person {
	String names;
	int age;
	String address;
	int phone;
	
	public person() {
		System.out.println("person class instantiated");
	}
	public person(String n, int a, String add, int p) {
		names=n;
		if (a<=0) {
			System.out.println("age can not be less than 0");
		}
		else {
			age=a;
		}
		address=add;
		phone=p;
				
	}
	public person(String n, int a) {
		names=n;
		if(a<=0) {
			System.out.println("age can not be less than 0");
		}
		else {
			age=a;
		}
	}
}
