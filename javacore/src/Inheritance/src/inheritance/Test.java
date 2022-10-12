package inheritance;

public abstract class Test {
	public static void main(String[] args) {
		person p1=new employee();
		person p2=new Student();
		person p3=new Manager();
		
		Manager m=new Manager("john",30000000,1001,"traning" );
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empid);
		System.out.println(m.dept);
		m.dosomething();
		
		employee emp=new employee();
		//emp.display();
		Manager man=new Manager();
		//man.display();
		employee e1=(employee)man;
		//e1.display();
		employee emp1=new employee();
		person p=(person)emp1;
		p.dosomething();
		
	}

}
