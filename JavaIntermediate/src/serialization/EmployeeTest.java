package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp= new Employee(1000,"james",10000,"undisclosed", "james200@gmail.com");
		try {
			FileOutputStream fileOut=new FileOutputStream("emp.txt");
			ObjectOutputStream Out=new ObjectOutputStream(fileOut);
			//write in file 
			Out.writeObject(emp);
			
			FileInputStream fileIn=new FileInputStream("emp.txt");
			// to convert bytes to Object
			ObjectInputStream In= new ObjectInputStream(fileIn);
			Employee prodCopy=(Employee)In.readObject();
			System.out.println(prodCopy.empId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.salary);
			System.out.println(prodCopy.designation);
			System.out.println(prodCopy.email);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
