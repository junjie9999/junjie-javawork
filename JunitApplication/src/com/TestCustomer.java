package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;

public class TestCustomer {
	@Test
	public void runFindBiggest() {
	// assertEquals check if the argument is equal to 2nd argument
	assertEquals(20, Calculator.findBiggest(20,10, 15));	
	}


}
