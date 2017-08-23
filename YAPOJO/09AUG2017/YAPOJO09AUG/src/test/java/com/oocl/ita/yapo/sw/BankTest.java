package com.oocl.ita.yapo.sw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankTest {
	CheckAccount chkAccount = new CheckAccount();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Before
	public void testDeposit( ) {
		assertEquals(500, chkAccount.deposit(500), 0.0);
	}
	
	@After
	public void testBalance( ) {
		assertEquals(490.0, chkAccount.checkBalance(), 0.0);
	}
	
	@Test(expected = InsufficientFundsException.class)
	public void testWithdraw( ) throws InsufficientFundsException {
		assertEquals(490.0, chkAccount.withdraw(10), 0.0);
	}
	
//	@Test(expected = InsufficientFundsException.class)
//	public void testWithdraw2( ) throws InsufficientFundsException {
//		assertEquals(0, chkAccount.withdraw(5000), 0.0);
//	}
}
