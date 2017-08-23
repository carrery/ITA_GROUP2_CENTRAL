package com.oocl.ita.yapo.sw;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testMavenJUnitParameterized {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	testMavenClass test = new testMavenClass();
	
	private String input;
	private String expectedOutput;
	
	public testMavenJUnitParameterized(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String ExpectedAndInput[][] = {{"ABC","BC"},{"LMOP","LMOP"},{"YAPO","YPO"}};
		return Arrays.asList(ExpectedAndInput);
	}
	
	@Test
	public void test1() {
		//System.out.println(expectedOutput);
		System.out.println(input);
		assertEquals(expectedOutput, test.truncateAInFirst2Positions(input));
	}
}
