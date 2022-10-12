package methodoverloading;

public class Newstrings {
	public static void main(String[] args) {
		 String str1 = "yesterday it was raining";
		 String str2 = "today it is sunny";

		 String mySubString1 = str2.substring(0, 11);
		 String mySubString2 = str1.substring(16, 24);
		 System.out.println(mySubString1 + mySubString2);
	}

}
