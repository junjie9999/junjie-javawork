package fileIO;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderExample {
	public static void main(String[] args) {
		try {
		Reader r=new FileReader("C:\\qafiles\\file.txt");
		int data=r.read();
		while(data !=-1) 
		{
			System.out.print((char)data);
			data=r.read();
			
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
