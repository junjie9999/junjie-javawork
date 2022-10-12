package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sample {
	public static void main(String[] args) {
	try {
		int x= 10;
		int y=0;
		int z=x/y;
		int[] nums=new int[5];
		nums[5]= 200;
		Connection con=DriverManager.getConnection("","","");
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("something Arithmetic problem");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("something Arithmetic problem");
	}catch( SQLException e) 
	{
		System.out.println(e.getMessage());
		System.out.println("could not connect to the database");

	}finally {
		System.out.println("it will get executed anyway");
	}
}
	
	
}