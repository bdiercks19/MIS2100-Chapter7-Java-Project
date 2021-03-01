package Diercks.Ben.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

import MyGradleProject.SimpleMath;

public class SimpleMathTest {
	
	@Test
	public void testThatZeroNumeratorReturnsZero(){
		SimpleMath math = new SimpleMath();
		assertEquals(0,math.divide(0, 7),0.001);
	}

	@Test 
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath math = new SimpleMath();
		assertEquals(0.25, math.divide(1, 4),0.001);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath math = new SimpleMath();
		math.divide(6, 0);
		
	}
	
}
//