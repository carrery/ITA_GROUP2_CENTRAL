package com.oocl.bangipr.sw1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class BankingTest {


	Bank banking = new Bank();
	CheckingAcc check = new CheckingAcc();
	
	private String expected, actual;
	
	public BankingTest(String expected, String actual) {
		this.expected = expected;
		this.actual = actual;
	}
	
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String output[][] = {{"Hannah", "Hannah"}, {"Admin", "Admin"}};
		
		return Arrays.asList(output);
	}
	
	@Test
	public void testUser() {
		assertEquals(this.expected, banking.login(this.actual));
	}
	
	@Test
	public void testBalance() {
		assertEquals(1000, check.Balance("Balance"), 0.00);
	}
	
	@Test
	public void testDeposit() {
		assertEquals((1000+500), check.Deposit("Deposit", 500), 0.00);
	}
	
	@Test(expected = Exception.class)
	public void testWithdraw() {
		
		try {
			 check.Withdraw("Withdraw",500);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		assertEquals((1000-500), check.Withdraw("Withdraw", 500), 0.00);
	}
}
