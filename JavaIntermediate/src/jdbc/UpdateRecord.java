package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connect success");
			
			/***new code******/
			String query="update customer set phone=1111111 where id=106";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("one record instead success");
			
		}catch(Exception e) 
		{	
			System.out.println(e.getMessage());
			System.out.println("something went wrong");
		}
	}
}
