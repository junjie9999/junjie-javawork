package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import Unit.Calculator;

public class Annotation {
	int maths;
	int chemistry;
	int english;
	
	@BeforeClass
	public static void m1() {
		System.out.println("@before class executes before all the class");
	}
	
	@Before
	public void m2() {
		System.out.println("test class executed next");
		this.chemistry=40;
		this.english=66;
		this.maths=40;
	}
	@After
	public void m3() {
		this.chemistry=0;
		this.english=0;
		this.maths=0;
		System.out.println("test class executes succefully");
	}
	@AfterClass
	public static void m4() {
		System.out.println("executes after all the class");
	}
	@Ignore
	public static void m5() {
		System.out.println("don't executes after all the");
	}
	@Test
	public void runFindBig() {
		assertEquals(true, Calculator2.findAvgMarks(maths,chemistry, english));		
	
	}
	

}
