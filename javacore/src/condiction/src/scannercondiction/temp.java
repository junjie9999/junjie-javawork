package scannercondiction;

import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("please enter your name");
		String name=scn.next();
		System.out.println("please enter your city");
		String city=scn.next();
		if (city.equals("london")) 
			System.out.println("hello london");
		else if (city .equals("newyork"))
			System.out.println("hello");
		else
			System.out.println("other city");
		scn.close();
		}

	}

