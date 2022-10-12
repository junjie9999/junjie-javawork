package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sample2 {
	public static void main(String[] args) {
		try {
			int x= 10;
			int y=0;
			int z=x/y;
			int[] nums=new int[5];
			nums[5]= 200;
			Connection con=DriverManager.getConnection("","","");
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
	            System.out.println(e.getMessage());
	            System.out.println("We can not div a num by zero");
		}finally {
			System.out.println("it will get executed any ways");
			
		}
		System.out.println("after catch");

}}
