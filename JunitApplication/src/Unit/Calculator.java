package Unit;

public class Calculator {
	public static int findBig(int x, int y) {
		if (x>y)
			return x;
		else 
			return y;
	}
	public static int findSmall(int x, int y) {
		if (x>y)
			return y;
		else 
			return x;

}
	public static int findBiggest(int x, int y, int z)
	{
		if(x>y && x>z)
		return x;
		else if (y>x && y>z)
		return y;
		else 
			return z;
		
}
	public static int findMax(int[] arr) {
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
		
	}
}
