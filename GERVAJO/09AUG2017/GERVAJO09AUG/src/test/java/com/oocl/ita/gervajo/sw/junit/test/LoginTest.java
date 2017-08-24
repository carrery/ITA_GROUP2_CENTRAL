package com.oocl.ita.gervajo.sw.junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oocl.ita.Login;

public class LoginTest {

	Login login;

	@Before
	public void before() {
		login = new Login();
		login.setUsername("jagjagjag");
		login.setPassword("ediwow123");
	}
	

	@Test
	public void testCorrectLogin() {
		String credentials = login.validateCredentials("jagjagjag", "ediwow123");
		assertEquals("true", credentials);
	}

	@Test
	public void testIncorrectUsername() {
		String credentials = login.validateCredentials("jagjag", "ediwow123");
		assertEquals("false", credentials);
	}

	@Test
	public void testIncorrectPassword() {
		String credentials = login.validateCredentials("jagjag", "ediw0w1234");
		assertEquals("false", credentials);
	}

	@Test
	public void testIgnoreCasePassword() {
		String credentials = login.validateCredentials("jagjag", "EDIWOW123");
		assertEquals("false", credentials);
	}

}
