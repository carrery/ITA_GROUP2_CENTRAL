package com.oocl.bangipr.sw1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelpetTestParameterized {

	

	public StringHelpetTestParameterized(String output) {
		super();
		this.output = output;
	}

	StringHelper helper = new StringHelper();
	
	private String input;
	private String output;

	public StringHelpetTestParameterized(String input, String output) {
		this.input = input;
		this.output = output;
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String output[][] = {{"AACD", "CD"}, {"ACD", "CD"}};
		
		return Arrays.asList(output);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(output, helper.truncateAInFirst2Positions(input));
	}
}
