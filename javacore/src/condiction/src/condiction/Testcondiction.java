package condiction;

public class Testcondiction {
	public static void main(String[] args) {
		int num1= 5;
		int num2=3;
		if (num1 < num2) {
			System.out.println("num1 is bigger");
		}else {
			System.out.println("num2 is bigger");
		}
		int x= 10;
		int y= 20;
		int z= 400;
		if (x>y && y>z) {
			System.out.println(" x is bigger");
		}else if (y>x && x>y) {
			System.out.println( " y is bigger");
		}else {
			System.out.println(" z is bigger");
		}
	}
	

}
