package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestng {
	
	@Test
	@Parameters({"myName","a"})
	public void parameter(String myName, int a) {
		
		System.out.println(myName);
		System.out.println(a);
	}

}
