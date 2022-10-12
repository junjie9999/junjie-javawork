package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
		Writer w=new FileWriter("C:\\qafiles\\file.txt");
		String content="Welecometo the world of java ";
		w.write(content);
		w.close();
		System.out.println("sucess");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
