package com.oocl.licupca.sw;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class JUnitMainTest {
	
	@Test
	public void checkArray(){
		int [] a1 = {1,2,3};
		int [] a2 = {3,2,1};
		Arrays.sort(a2);
		assertArrayEquals(a1,a2);
//		assertEquals(a1,a2);
	}
	
	@Test (expected = NullPointerException.class)
	public void checkNull() {
		
	}
	
	@Test (timeout = 50)
	public void testPerformance() {
		for (int i = 0; i < 1000000; i++) {
			Arrays.sort(new int[] {i, i -1 , i+1} );
		}
	}
	
	@Test
	public void testTruncateChuchu() {
		
	}
	
}
