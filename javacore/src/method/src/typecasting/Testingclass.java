package typecasting;

public class Testingclass {
	public static void main(String[] args) {
		int x;
		long y=1838347575;
		x=(int)y;
		System.out.println(x);
		
		float m=234.66f;
		int n=(int)m;
		System.out.println(n);
		char[] h = { 'A','B','C'};
		String temp=h.toString();
		String hellostring = new String(temp);
		System.out.println(temp);
		
		
		
	}
}
