package reduce;

import java.util.stream.IntStream;

public class ReduceExample {
	public static void main(String[] args) {
		int result=IntStream.range(1,5)
				.reduce(23, (a,b)->a+b);
		System.out.println(result);
		int result1=IntStream.range(1, 5)
				.parallel()
				.reduce(23, (a,b)->a+b);// it start with 23 23+1 23+2->24+25 
		System.out.println(result1);
	}

}
