package inheritance;

public class Manager extends employee{
	String dept;
	public Manager() {}
	public Manager(String name, int age, int empid, String dept) 
	{
		super(name, age, empid);
		this.dept =dept;
		System.out.println("manager constructor");
	
	}

	}
	
	


