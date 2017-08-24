package com.oocl.ita.gervajo.sw.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oocl.ita.gervajo.sw.exception.CheckingAccount;
import com.oocl.ita.gervajo.sw.exception.InsufficientFundException;

public class BankTest {

	CheckingAccount ca;

	@Before
	public void before() {
		ca = new CheckingAccount(2012300072);
	}

	@Test
	public void testDeposit() {
		ca.deposit(500);
		assertEquals(500, ca.getBalance(), 0.0);
	}

	@Test
	public void testWithdrawWithBalance() throws InsufficientFundException {
		ca.deposit(500);
		ca.withdraw(300);
		assertEquals(200, ca.getBalance(), 0.0);
	}

	@Test(expected = InsufficientFundException.class)
	public void testWithdrawWithNobalance() throws InsufficientFundException {
		ca.withdraw(500);
	}
	
	
	
	

}
