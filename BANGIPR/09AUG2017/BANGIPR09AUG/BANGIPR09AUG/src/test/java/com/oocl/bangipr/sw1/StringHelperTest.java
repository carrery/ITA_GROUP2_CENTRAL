package com.oocl.bangipr.sw1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper  helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
		System.out.println("Before test");
	}
	
	@Test(timeout = 50)
	public void testPerformance() {
		for(int i =0; i<1000000; i++) {
			Arrays.sort(new int[] {i,i-1, i+1});
		}
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	
		//assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		//fail("Not yet implemented");
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
//	
//	@Test(expected = NullPointerException.class)
//		public void testArraySort_NullArray() {
//			int[] numbers = null;
//		//	int [] expected = Arrays.sort(numbers);
//			
//			//assertArrayEquals(expected, numbers);
//		}
//	
//	
//	
}
