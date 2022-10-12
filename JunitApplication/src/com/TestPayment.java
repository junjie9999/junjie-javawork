package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;

public class TestPayment {
	@Test
	public void runFindMax() {
		int[] myArray= {100,20,30,500,400};
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(20, Calculator.findMax(myArray));	
	}


}
