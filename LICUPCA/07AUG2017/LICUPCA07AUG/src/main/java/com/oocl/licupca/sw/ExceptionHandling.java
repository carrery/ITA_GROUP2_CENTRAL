package com.oocl.licupca.sw;

class TestObject {
	String value;
	public TestObject(String value) throws Exception {
		this.value = value;
		if (value == "You Are The Only")
			throw new YouAreTheOnlyException();
		else if (value == "Kerberos")
			throw new TimbuchakaException();
		else if (value == "Nonie")
			throw new DeleteTheWholeWorldException();
	}
}

class YouAreTheOnlyException extends Exception {
	
}

class TimbuchakaException extends Exception {
	
}

class DeleteTheWholeWorldException extends Exception {
	
}

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			TestObject testObject = new TestObject(null);
			System.out.println(testObject.value.length());
		} catch (Exception e) {
			System.err.println("Caught exception "+e);
		}
		
		try {
			TestObject YouAreTheOnlyObject = new TestObject("You Are The Only");
		} catch (Exception e) {
			System.err.println("Caught exception "+e);
		}
		
		try {
			TestObject ExceptionalObject = new TestObject("Kerberos");
		} catch (Exception e) {
			System.err.println("Caught exception "+e);
		}
		
		try {
			TestObject NonieObject = new TestObject("Nonie");
		} catch (Exception e) {
			System.err.println("Caught exception "+e);
		}
		
		
	}

}
