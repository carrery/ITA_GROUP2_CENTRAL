package com.junittest;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringManipulationTest {

	StringManipulation helper;
	
	@Before
	public void before() {
		helper = new StringManipulation();
		System.out.println("Before Test");
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//assertEquals("CD", helper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
	}

}
