package loop;

//import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		//Scanner scn= new Scanner(System.in);
		System.out.println("please enter the year");
        //int year = scn.next();
    		int year = 2004;
    		if (year % 4 == 0) {
    			if (year % 100 == 0 && year % 400 == 0) {
    				System.out.println("This is leap year");

    			} else {
    				System.out.println("its not is leap year");
    			}
    		} else {
    			System.out.println("its not leap");
    		}
    	}

    }

