package com.oocl.ita.yapo.sw;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class testMavenJUnit {
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddition() {
		int sum = testMavenClass.addition(20, 20);
		assertEquals(40, sum);
	}
	
	@Test
	public void testSubtraction() {
		int difference = testMavenClass.subtraction(20, 20);
		assertEquals(0, difference);
	}
	
	@Test
	public void testMultiplication() {
		int product = testMavenClass.multiplication(20, 20);
		assertEquals(400, product);
	}
	
	@Test
	public void testDivision() {
		int quotient = testMavenClass.division(20, 20);
		assertEquals(1, quotient);
	}
	
	@Test
	public void testNumber1() {
		String result = testMavenClass.number1();
		assertEquals("default", result);
	}
	
	@Test
	public void testNumber2() {
		int result = testMavenClass.number2();
		assertEquals(8, result);
	}
	
	@Test
	public void testNumber3() {
		int result = testMavenClass.number3();
		assertEquals(26, result);
	}
	
	@Test
	public void testNumber4() {
		testMavenClass.number4();
	}
	
	@Test
	public void testNumber7() {
		int result = testMavenClass.number7(60);
		assertEquals(5, result);
	}
	
	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};

		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	testMavenClass helper;
	
	@Before
	public void before() {
		helper = new testMavenClass();
		//System.out.println("@Before");
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test(timeout = 25)
	public void testPerformance() {
		for (int i=0; i<1000000; i++) {
			Arrays.sort(new int[] { i, i-1, i+1});
		}
	}

}
