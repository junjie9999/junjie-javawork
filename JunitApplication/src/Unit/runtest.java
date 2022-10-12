package Unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class runtest {
	@Test
	//check method 
	public void runFindBig() {
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(500, Calculator.findBig(500, 200));	
	}
	
	@Test
	public void runFindSmall() {
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(10, Calculator.findSmall(10, 20));	
	}
	@Test
	public void runFindBiggest() {
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(20, Calculator.findBiggest(20,10, 15));	
	}
	@Test
	public void runFindMax() {
		int[] myArray= {100,20,30,500,400};
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(20, Calculator.findMax(myArray));	
	}

}
