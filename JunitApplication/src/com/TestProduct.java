package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Unit.Calculator;

public class TestProduct {
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


}
