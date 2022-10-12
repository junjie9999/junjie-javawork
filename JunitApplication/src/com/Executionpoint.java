package com;

	import org.junit.runner.JUnitCore;
	import org.junit.runner.Result;
	import org.junit.runner.notification.Failure;

	public class Executionpoint {
		public static void main(String[] args) {
			System.out.println("bo something in app");
			Result res=JUnitCore.runClasses(masterTest.class);
			//res will collect all the result
			for(Failure fail:res.getFailures())
			{
				System.out.println(fail.toString());
			}
			System.out.println(res.wasSuccessful());
		
			System.out.println("do something in application");

}
	}
