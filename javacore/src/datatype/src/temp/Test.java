package temp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("please enter your name");
			String name =scn.next();
			System.out.print("please enter your last name" );
			String lastname= scn.next();
			System.out.print("please enter the year of birth");
			String year=scn.next();
			System.out.println("hello "+name+ lastname+ "  welcome to " + year );
		}
	

	}

}
