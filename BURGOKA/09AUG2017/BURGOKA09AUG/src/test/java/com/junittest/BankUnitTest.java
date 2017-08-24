package com.junittest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BankUnitTest {
	private String input;
	private String expectedOutput;

	public BankUnitTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	CheckAccount ck = new CheckAccount();
	BankTest1 helper = new BankTest1();
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {{"admin", "admin"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test() {
		assertEquals(expectedOutput, ck.getPassword(input));
	}

}