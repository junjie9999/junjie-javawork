package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		Product prod=new Product(1001,"TV", 1000, "Apple");
		
		try {//creating a file 
			FileOutputStream fileOut=new FileOutputStream("object.txt");
			//creating a file 
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			//write in file 
			oOut.writeObject(prod);
			
			// read file
			FileInputStream fileIn=new FileInputStream("object.txt");
			// to convert bytes to Object
			ObjectInputStream oIn= new ObjectInputStream(fileIn);
			Product prodCopy=(Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.brand);
			System.out.println(prodCopy.price);	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
