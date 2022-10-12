package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb";
			String userName="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("connect success");
			String query="select * from customer";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				int ID=rs.getInt(1);
				String name=rs.getString(2);
				int phone=rs.getInt(3);
				String email=rs.getString(4);
				System.out.println("***"+ID+ "***"+name+"***"+phone+"***"+email+"***");
				
			}
			
			
		}catch(Exception e) 
		{	
			System.out.println(e.getMessage());
			System.out.println("something went wrong");
		}
	}

}

