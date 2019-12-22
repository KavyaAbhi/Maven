package com.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest() {
		calculator ob1 = new calculator();
		assertEquals(10,ob1.addition(5, 5));
		}
	
	@Test
	public void subtest() {
		calculator ob1 = new calculator();
		assertEquals(10,ob1.subtraction(20, 10));
		}
	
	
	
	
	

}
