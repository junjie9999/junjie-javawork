package method;

import java.util.Scanner;

public class testcalculator {
	public static void main(String[] args) {
		// TODO auto-generated method stub
		calculator operationalobject = new calculator();
		
        Scanner input = new Scanner(System.in);
        double userInput;
        int userChoice;
        int a=20;
        int b=10;
        System.out.print("Please Enter The First Number: ");
        userInput = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        userInput = input.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = input.nextInt();
        System.out.println(a * b);

		switch (userChoice){
        case 1:
            operationalobject.addition();
            System.out.println();
            break;
        case 2:
            operationalobject.subtraction();
            break;
        case 3:
            operationalobject.division();
            break;
        case 4:
            operationalobject.multiplication();
            break;
        default:
        	System.out.println("invalid");
        	
		}
	}
}

