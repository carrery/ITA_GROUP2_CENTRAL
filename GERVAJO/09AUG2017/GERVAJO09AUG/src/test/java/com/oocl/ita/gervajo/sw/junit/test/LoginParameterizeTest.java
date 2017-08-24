package com.oocl.ita.gervajo.sw.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.oocl.ita.Login;

@RunWith(Parameterized.class)
public class LoginParameterizeTest {
	
	Login login = new Login();
	
	private String uname;
	private String pword;
	private String success;
	
		
	public LoginParameterizeTest(String uname, String pword, String success) {
		login.setUsername("jagjagjag");
		login.setPassword("ediwow123");
		this.uname = uname;
		this.pword = pword;
		this.success = success;
	}
	
	@Parameters
	public static List<String[]> testConditions(){
		String expectedOutput[][]= {{"jagjagjag","ediwow123","true"},{"jagjagjag","123456789","false"},{"jagjagjag","EDIWOW123","false"}};
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void test1() {
		assertEquals(success,login.validateCredentials(uname, pword));
	}
	
	
	
	

}
