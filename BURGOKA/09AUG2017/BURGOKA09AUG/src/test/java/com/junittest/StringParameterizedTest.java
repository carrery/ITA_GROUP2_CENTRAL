package com.junittest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringParameterizedTest {

	public StringParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	StringManipulation helper = new StringManipulation();
	 
	private String input;
	private String expectedOutput;
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {{"AACD", "CD"}, {"ACD", "CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
