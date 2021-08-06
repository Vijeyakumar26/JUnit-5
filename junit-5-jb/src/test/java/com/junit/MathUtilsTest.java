package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int actual = mathUtils.add(1, 1);
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10));
	}
	
	@Test
	public void testDivide() {
		MathUtils mathUtils = new MathUtils();
		//assertThrows(NullPointerException.class,() -> mathUtils.divide(1, 0));
	}
}
