package com.demo;

import org.testng.annotations.Test;

public class HelloWorldTest {

	
	@Test
	public void testOne() {
						
		String[] args = {};
		HelloWorld.main(args);
		
	}
	@Test
	public void testTwo() {
		
		String[] args = {"Stuart"};
		HelloWorld.main(args);
		
	}	
	
}
